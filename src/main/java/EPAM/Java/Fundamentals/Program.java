package EPAM.Java.Fundamentals;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.printf ("Name: %s\n", name);
        in.close();
    }
}