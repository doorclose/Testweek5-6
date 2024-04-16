package week7homework;
//14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//5 separately.

import java.util.Scanner;

public class Week7_Que14 {

    public static void main(String[] args) {
        System.out.println("Number divided by 3:-..>");
        for (int i =1; i<= 100; i++){
            if (i%3 == 0){
                System.out.print(i + "  ");

            }
        }
        System.out.println("\n number is divided by 5:->>") ;
        for (int i = 1; i<=100; i++){
            if (i%5==0){
                System.out.print(i + " ");
            }
        }

    }
}