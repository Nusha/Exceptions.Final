


import java.util.Scanner;

import io.*;
import model.*;
import util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные через пробел ([Фамилия] [Имя] [Отчество] [дата рождения] [номер телефона] [пол]): ");
        String input = scanner.nextLine().trim();

        try {
            // Разбор входных данных
            PersonBuilder builder = new PersonBuilder();
            builder.buildPerson(input);
            Person person = builder.getPerson();

            // Запись данных в файл
            DataWriter writer = new FileDataWriter();
            writer.write(person);
            System.out.println("Записано в файл: " + person.toString());
        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
