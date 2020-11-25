package EPAM.Java.Fundamentals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int numberAmount = scanner.nextInt();
        int[] randomNumbers = new int[numberAmount];
        Random random = new Random();

        for (int i = 0; i < numberAmount; i++) {
            randomNumbers[i] = random.nextInt();
        }

        System.out.println("Ваши числа в строку: " + Arrays.toString(randomNumbers));
        System.out.println("Ваши числа в столбец: \n" + Arrays.toString(randomNumbers).replace(' ', '\n'));
    }
}
