package model;

import io.*;
import util.*;
import java.time.LocalDate;

public class PersonBuilder {
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthDate;
    private PhoneNumber phoneNumber;
    private Gender gender;

    public void buildPerson(String input) throws InvalidDataException {
        String[] data = input.split("\\s+");
        if (data.length != 6) {
            throw new InvalidDataException("Неверное число параметров: " + data.length);
        }
        surname = data[0];
        name = data[1];
        patronymic = data[2];
        try {
            birthDate = DateUtil.parseDate(data[3]);
        } catch (Exception e) {
            throw new InvalidDataException("Неверный формат даты: " + data[3]);
        }
        phoneNumber = new PhoneNumber(data[4]);
        if (!phoneNumber.isValid()) {
            throw new InvalidDataException("Неверный формат номера телефона: " + data[4]);
        }
        gender = Gender.fromCode(data[5]);
        if (gender == null) {
            throw new InvalidDataException("Неверный формат пола: " + data[5]);
        }
    }

    public Person getPerson() {
        return new Person(surname, name, patronymic, birthDate.format(DateUtil.getDateTimeFormatter()), phoneNumber.toString(), gender);
    }
}
