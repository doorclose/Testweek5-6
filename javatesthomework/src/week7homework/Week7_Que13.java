package week7homework;

import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
public class Week7_Que13 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();


            System.out.print("Enter the operation (+, -, *, /): ");
            char operator = scan.next().charAt(0);

            double result;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {

                if (num2 == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator!!!");
                return;
            }

            System.out.println("Result-->: " + result);

            scan.close();
        }
    }


