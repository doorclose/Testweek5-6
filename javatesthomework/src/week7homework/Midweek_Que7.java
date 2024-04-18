package week7homework;

import java.util.Scanner;

//7. Take input of age of 3 people by user and determine oldest and youngest among
//them.
public class Midweek_Que7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age1  ");
        int age1 = scan.nextInt();

        System.out.println("Enter age2  ");
        int age2 = scan.nextInt();

        System.out.println("Enter age3  ");
        int age3 = scan.nextInt();

        if(age1<age2 && age1<age3) {
            System.out.println("Age1 person  is younger   ");

        } else if (age2<age1 && age2<age3) {
            System.out.println("Age2 person is younger  ");

        } else{
            System.out.println("Age3 person is younger  ");
            
         }

        if(age1>age2 && age1>age3) {
            System.out.println("Age1 person  is oldest   ");

        } else if (age2>age1 && age2>age3) {
            System.out.println("Age2 person is oldest ");

        } else{
            System.out.println("Age3 person is oldest  ");

        }


      }


    }
