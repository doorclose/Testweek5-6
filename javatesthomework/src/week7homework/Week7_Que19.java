package week7homework;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
import java.util.Scanner;

public class Week7_Que19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter any number:-->");
        int number = scan.nextInt();


        if (number>0){
            System.out.println("Given Number is Positive(+) :--> " + number);
        } else if (number<0) {
            System.out.println("Given Number is Negative (-) :->> " + number);
        } else {
            System.out.println("Given number is Zero (0) :->>");
        }

    }
}
