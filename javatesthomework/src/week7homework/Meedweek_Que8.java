package week7homework;

import java.util.Scanner;

public class Meedweek_Que8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of classes held:==> ");
        int classHeld =scan.nextInt();

        System.out.println("Enter number of classes attend:==> ");
        int classAttend = scan.nextInt();
        double percentageOfAttendace = (double) classAttend / classHeld *100;

        System.out.println("Percentage of classes attended :==> " +percentageOfAttendace + "%");

        if (percentageOfAttendace<=75) {
            System.out.println("Student is not allowed to sit in exam!! ");
        }else{
            System.out.println("Student is allowed to sit in exam !!");
        }
    }
}
