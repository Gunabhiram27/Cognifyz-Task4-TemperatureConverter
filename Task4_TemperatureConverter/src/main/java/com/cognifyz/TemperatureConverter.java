package com.cognifyz;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("🌡️ Welcome to the Temperature Converter by Abhi!");

        while (running) {
            System.out.println("\nChoose conversion:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheitResult = (celsius * 9 / 5) + 32;
                    System.out.printf("Result: %.2f °F\n", fahrenheitResult);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsiusResult = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("Result: %.2f °C\n", celsiusResult);
                    break;
                case 3:
                    running = false;
                    System.out.println("👋 Exiting... Thank you for using the converter!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
