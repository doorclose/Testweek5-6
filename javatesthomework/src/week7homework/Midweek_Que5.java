package week7homework;

import java.util.Scanner;

public class Midweek_Que5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter number1  ");
        int number1 = scan.nextInt();
        System.out.println("Enter number2  ");
        int number2 = scan.nextInt();

        if(number1==number2) {
            System.out.println("Result is : Both number are same ");

        } else if (number1>number2) {
            System.out.println(" REsult is : number1 is bigger then number2 ");

        }else{
            System.out.println("REsult is : number2 is bigger then number1");
          }


      }


    }

