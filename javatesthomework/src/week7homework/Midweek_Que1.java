package week7homework;

import java.util.Scanner;

//
// 1. Take 10 integers from keyboard using loop and print their average value on the
//screen.
public class Midweek_Que1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        //System.out.println("Enter average value");
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter  value:->" + (i + 1));
            int number = scan.nextInt();
            num+= number;
            double average = num/10;

           // System.out.println("sum of ten intger value " +num);
            System.out.println("Average of all values:->" +average);

        }
    }
}