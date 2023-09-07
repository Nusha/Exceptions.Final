package model;


public enum Gender {
    MALE('M'), FEMALE('F');

    private final char code;

    Gender(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    // Перевод кода в пол
    public static Gender fromCode(String code) {
        switch (code.toLowerCase()) {
            case "m":
                return MALE;
            case "f":
                return FEMALE;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return Character.toString(code);
    }
}
