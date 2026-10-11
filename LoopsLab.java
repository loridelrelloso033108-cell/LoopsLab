/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab;

import java.util.Scanner;

public class LoopsLab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== BASIC MATH APP MENU ===");
            System.out.println("1. Multiplication Table Generator");
            System.out.println("2. Sum of Natural Numbers");
            System.out.println("3. Factorial Calculator");
            System.out.println("4. Even and Odd Numbers");
            System.out.println("5. Reverse Digits of a Number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number.");
                input.next();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();

            switch (choice) {

                // Activity 1: Multiplication Table (for loop)
                case 1 -> {
                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    int num = input.nextInt();

                    System.out.println("Multiplication Table of " + num);

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(
                                num + " x " + i + " = " + (num * i)
                        );
                    }
                }

                // Activity 2: Sum of Natural Numbers (while loop)
                case 2 -> {
                    System.out.print("Enter the number N: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                        System.out.print("Enter the number N: ");
                    }

                    int n = input.nextInt();

                    if (n < 1) {
                        System.out.println("Error! N must be at least 1.");
                    } else {
                        long sum = 0;
                        int i = 1;

                        while (i <= n) {
                            sum = sum + i;
                            i++;
                        }

                        System.out.println("Sum = " + sum);
                    }
                }

                // Activity 3: Factorial Calculator (do-while loop)
                case 3 -> {
                    System.out.print(
                            "Enter a whole number from 0 to 20: "
                    );

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                        System.out.print(
                                "Enter a whole number from 0 to 20: "
                        );
                    }

                    int n = input.nextInt();

                    if (n < 0 || n > 20) {
                        System.out.println(
                                "Error! Enter a number from 0 to 20."
                        );
                    } else {
                        long factorial = 1;
                        int i = 1;

                        do {
                            if (i <= n) {
                                factorial = factorial * i;
                            }
                            i++;
                        } while (i <= n);

                        System.out.println("Factorial = " + factorial);
                    }
                }

                // Activity 4: Even and Odd Numbers (for loop)
                case 4 -> {
                    System.out.print("Enter the number N: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                        System.out.print("Enter the number N: ");
                    }

                    int n = input.nextInt();

                    if (n < 1) {
                        System.out.println("Please enter a number at least 1.");
                    } else {
                        System.out.print("Even numbers: ");

                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }

                        System.out.println();
                        System.out.print("Odd numbers: ");

                        for (int i = 1; i <= n; i++) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            }
                        }

                        System.out.println();
                    }
                }

                // Activity 5: Reverse Digits (while loop)
                case 5 -> {
                    System.out.print("Enter an integer to reverse: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                        System.out.print("Enter an integer to reverse: ");
                    }

                    int number = input.nextInt();
                    long reversed = 0;
                    long remaining = Math.abs((long) number);

                    while (remaining != 0) {
                        long lastDigit = remaining % 10;
                        reversed = reversed * 10 + lastDigit;
                        remaining = remaining / 10;
                    }

                    if (number < 0) {
                        reversed = -reversed;
                    }

                    System.out.println("Reversed: " + reversed);
                }

                // Exit option
                case 0 -> {
                    System.out.println("Thank you for using this Math App!");
                    System.out.println("Have a great day!");
                }

                default ->
                    System.out.println(
                            "Invalid choice. Please choose from 0 to 5."
                    );
            }

        } while (choice != 0);

        input.close();
    }
}
