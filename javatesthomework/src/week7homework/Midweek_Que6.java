package week7homework;
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A

import java.util.Scanner;

public class Midweek_Que6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks ");
        int marks = scan.nextInt();

        char grade;
        if (marks<25) {
            grade = 'F';
        } else if (marks>=25 && marks <45) {
            grade = 'E';
        } else if (marks>=45 && marks <50) {
            grade = 'D';
        } else if (marks>=50 && marks<60) {
            grade = 'C';
        } else if (marks>=60 && marks<80) {
            grade = 'B';
        }else {
            grade = 'A';
        }
            System.out.println("Student Grade is :==>  " +marks+  "    "+ grade);



          }
       }




