package io;
import model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class FileDataWriter implements DataWriter {
//    private static final String DIRECTORY_PATH = "data/";

    @Override
    public void write(Person person) throws InvalidDataException {
        String filePath =  person.getSurname() + ".txt";
        try (FileWriter writer = new FileWriter(new File(filePath), true)) {
            writer.write(person.getSurname() + " " + person.getName() + " " + person.getPatronymic() + " " + person.getBirthDate() + " " + person.getPhoneNumber().toString() + " " + person.getGender().toString() + "\n");
        } catch (IOException e) {
            throw new InvalidDataException("Ошибка при записи в файл");
        }
    }
}
