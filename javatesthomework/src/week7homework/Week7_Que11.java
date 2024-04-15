package week7homework;

import java.util.Scanner;

//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.
public class Week7_Que11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter characters between A to F :");
        char alphabet = scan.next().charAt(0);

        if (alphabet == 'A') {
            System.out.println("Ahmedabad");

        }else if (alphabet == 'B'){
            System.out.println("Baroda");

        }else if (alphabet == 'C'){
            System.out.println("Chandigadh");

        }else if (alphabet == 'D'){
            System.out.println("Dubai");

        }else if (alphabet == 'E'){
            System.out.println("Europe");

        }else if (alphabet == 'F'){
            System.out.println("Florida");

        }else {
            System.out.println(" Invalid character for cityname, enter valid character  ");
        }

    }
}
