package EPAM.Java.Fundamentals;

import java.util.Scanner;

public class Task4 {

        public static void main (String[] args){

            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество чисел: ");
            int numberAmount = in.nextInt();
            System.out.println("Введите последовательность чисел через enter: ");

            int[] numbers = new int[numberAmount];

            for (int index = 0; index < numberAmount; index++) {
                System.out.print("Введите число " + String.valueOf(index+1) + ": ");
                numbers[index] = in.nextInt();

            }
            sum(numbers);
        }
        static void sum(int ...nums){

            int result =0;

            for (int i = 0; i < nums.length; i++) {
                result += nums[i];
            }
            System.out.println(result);
        }
    }