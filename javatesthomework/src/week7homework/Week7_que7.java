package week7homework;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even.//
public class Week7_que7 {
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



