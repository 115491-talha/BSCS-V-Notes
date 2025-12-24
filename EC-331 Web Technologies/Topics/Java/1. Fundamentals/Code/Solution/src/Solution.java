import java.util.Scanner;

public class Solution {
    private static void Print(String message)
    {
        System.out.println("\n*************** " + message + " ***************");
    }

    /*
    Q1. Write a Java program that:
        1. Takes name and age as input
        2. Displays them in one sentence
    */
    public static void Question1() {
        Print("Question 1");

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take name from user
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // Take age from user
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        // Display output
        System.out.println("My name is " + name + " and my age is " + age);
    }

    /*
    Q2. Write a program to:
        1. Declare a constant PI
        2. Calculate area of a circle using user input
    */
    public static void Question2()
    {
        Print("Question 2");

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Value of pi
        final float pi = 3.14f;

        // Take radius from user
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = pi * radius * radius;

        // Display the area
        System.out.println("The area of the circle is " + area);
    }

    /*
    Q3. Demonstrate explicit type casting by converting:
        1. double → int
        2. Print both values
    */
    public static void Question3()
    {
        Print("Question 3");

        // Variables
        double d;
        int i;

        // Assigning values
        d = 3.14159265358979323846;
        i = (int) d;

        // Display values
        System.out.println("Double:\t\t" + d);
        System.out.println("Integer:\t" + i);
    }

    /*
    Q4. Write a Java program that:
        1. Reads three integers
        2. Prints their average (ensure correct type casting)
    */
    public static void Question4()
    {
        Print("Question 4");

        // Variables
        int a, b, c;

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take input for all three variables
        System.out.println("Enter three numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        // Calculate average
        double avg = (a + b + c) / 3.0;

        // Display the result
        System.out.println("Average is " + avg);
    }

    /*
    Q5. Explain why this program prints wrong result and fix it:

        int a = 5;
        int b = 2;
        double result = a / b;
    */
    public static void Question5()
    {
        Print("Question 5");

        // Variables
        int a = 5;
        int b = 2;
        double result = a / b; // ❎
        System.out.println("Result (Old): " + result);

        /*
        REASON: Due to implicit typecasting, on the result calculation the floating point number mismatches, and it gives wrong output.
        The solution is given below 👇
        */
        // Output
        result = (double) a / b; // ✅
        System.out.println("Result (Fix): " + result);
    }
}
