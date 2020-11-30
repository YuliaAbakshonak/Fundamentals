package EPAM.Java.Fundamentals;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность: ");
        String numbers = scanner.nextLine();
        System.out.println(numbers.length());

        String result = "";

        for (int i = numbers.length() - 1; i >= 0; i--) {
            result += numbers.charAt(i);
        }

        System.out.println("Обратная последовательность: " + result);
    }
}