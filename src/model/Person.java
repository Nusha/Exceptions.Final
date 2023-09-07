package model;


public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;
    private String phoneNumber;
    private Gender gender;

    public Person(String surname, String name, String patronymic, String birthDate, String phoneNumber, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender.toString();
    }
}
