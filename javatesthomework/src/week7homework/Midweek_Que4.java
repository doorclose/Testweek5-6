package week7homework;

import java.util.Scanner;

//4. Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Midweek_Que4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Length of Renctangle :->>");
        double length = scan.nextDouble();

        System.out.println("Enter breadth of Renctangle:->> ");
        double breadth = scan.nextDouble();

        if (length == breadth) {
            System.out.println("It is Squre");
        }else{
            System.out.println("It is Rectengle");
        }
    }
}