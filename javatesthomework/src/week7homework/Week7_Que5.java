package week7homework;

import java.util.Scanner;

public class Week7_Que5 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student Name ==>");
        String n = scan.nextLine();

        System.out.println("Enter Student Roll Number: ==>");
        String r = scan.nextLine();

        System.out.println("Enter Maths science English Marks :==> ");
        int Maths = scan.nextInt();

        //System.out.println("Enter  Science Marks: 0-100 ==> ");
        int Science = scan.nextInt();

      // System.out.println("Enter  English Marks: 0-100 ==>");
        int English = scan.nextInt();

        if (Maths < 0 || Maths > 100 || Science < 0 ||Science >100 || English < 0 || English > 100){

            System.out.println("Invalid Input! Marks should be between 0 and 100");
            return;
        }


        int totalMarks = Maths +  Science + English;
        double p = totalMarks / 300.00 * 100.00;

        String g = "  ";
        if (p >= 80) {
            g = "A+";

        } else if (p >= 60) {
            g = "A";

        } else if (p >= 50) {
            g = "B";

        } else if (p >= 35) {
            g = "C";

        }


        if (p >= 35) {
            System.out.println(" Pass ");

        } else   {

          System.out.println(" Fail  ");
       }


        if (Maths < 35) {
            System.out.println("Fail");

        } else if (Science < 35) {
            System.out.println("Fail");

        } else if (English < 35) {
            System.out.println("Fail");
        }

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + p);
        System.out.println(" Grade ==> " + g);



        System.out.println("__________________________________|");
        System.out.println("|                                 |");
        System.out.println("|        Mark Sheet               |");
        System.out.println("| Name   :  "+n+                 "|");
        System.out.println("| Roll No:  "+r+                 "|");
        System.out.println("                                   ");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        System.out.println("|   Subject         :        Marks|");
        System.out.println("|_________________________________|");
        System.out.println("|   Math :   "+ Maths +           "|");
        System.out.println("| Science:    "+ Science +      " |");
        System.out.println("| English:   "+ English +          " |");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        System.out.println("|  Total: "+ totalMarks +        "|");
        System.out.println("                                  |");
        System.out.println("|_________________________________|");
        System.out.println("|Percentage:  " + p +"            |");
        //System.out.println("|Result             :         |");
       System.out.println("|Grade :      " + g + "            |");
        System.out.println("__________________________________|");

    }


}
