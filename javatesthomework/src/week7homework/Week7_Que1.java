package week7homework;

import java.util.Scanner;

//1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
//operator (? :)//
public class Week7_Que1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter a number");
       int num = scan.nextInt();

        if(num % 2 == 0)
            System.out.println("Given number is Even :->> " + num);
        else
            System.out.println("Given number is Odd:->>   " + num);
    }
}
