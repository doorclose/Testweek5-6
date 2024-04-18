package week7homework;
//8  A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
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
        //9. Modify the above question to allow student to sit if he/she has medical cause. Ask
        //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

        System.out.println("Person can sit in exam : Yes or No?? ");
        char medicalcause = scan.next().charAt(0);

        if( medicalcause == 'Y'|| medicalcause=='y'){
           System.out.println("Student is allow to give exam");
        }else{
           System.out.println("Student is not allow to give exam");


        }

        }

    }

