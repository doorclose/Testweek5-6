package week7homework;
//Write a program that tells us input value is number or an alphabet orsymbol.
import java.util.Scanner;

public class Week7_Que15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value");
        char input = scan.next().charAt(0);

        if (input >= 'A' && input <= 'Z') {
            System.out.println("Given input is Alphabet  ");

        } else if
            (input >= 0 && input <= 9) {
                System.out.println("Given Value is Number ");
            }

            else {
                System.out.println(" Input is Symbol");


            }
        }
    }
