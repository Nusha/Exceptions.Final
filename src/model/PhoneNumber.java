package model;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        // Проверка на корректность номера телефона
        return true;
    }

    @Override
    public String toString() {
        return number;
    }
}
