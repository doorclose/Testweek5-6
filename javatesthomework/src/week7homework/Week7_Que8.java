package week7homework;

import java.util.Scanner;

//Que 8 Write a java program to get numbers from users and print whether it is positive or negative.
public class Week7_Que8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter any number:-->");
        int number = scan.nextInt();


        if (number>0){
            System.out.println("Given Number is Positive  " + number);
        } else if (number<0) {
            System.out.println("Given Number is Negative  " + number);
        } else {
            System.out.println("Given number is Zero ");
        }

    }
}
