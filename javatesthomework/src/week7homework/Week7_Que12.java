package week7homework;

import java.util.Scanner;

public class Week7_Que12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter characters between A to F :");
        String city = scan.nextLine();



        switch (city){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B'":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chandigadh");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("England");
                break;
            case "F":
                System.out.println("Florida");
                break;
            default:
                System.out.println("INVALID DATA");
        }
    }
}
