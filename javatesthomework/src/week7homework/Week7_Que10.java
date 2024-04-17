package week7homework;

import java.util.Scanner;

// 10 Write a java program input sales id, seller's name, sales amount, and salary basic and then
//fined this salesCommission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

public class Week7_Que10 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter sales ID");
        int salesID = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter seller Name");
        String sellerName = scan.nextLine();

        System.out.println("Enter sales Amount");
        double salesAmount = scan.nextDouble();

        System.out.println("Enter Basic salary");
        double basicSalary = scan.nextDouble();

        double Commission;
        if (salesAmount >= 50000)
            Commission = 0.35;
        else if (salesAmount >= 30000)
            Commission = 0.20;
        else if (salesAmount >= 20000)
            Commission = 0.10;
        else if (salesAmount >= 10000)
            Commission = 0.5;
        else
            Commission = 0.2;

        double commissionRate = salesAmount * Commission;

        double basicSalaryRate = basicSalary + Commission;

        System.out.println("           Salary Commission             ");
        System.out.println("Enter saleId :" + salesID                   );
        System.out.println("Enter Seller's Name :" + sellerName         );
        System.out.println("Enter Sale's Amount :" + salesAmount        );
        System.out.println("Enter Basic salary :" + basicSalary         );
        System.out.println("=========================================");
        System.out.println(" Enter commission :" + Commission * 100 + "%");
        System.out.println("Enter commissionRate :" + commissionRate);
        System.out.println("Enter basicSalaryRate :" + basicSalaryRate);
        System.out.println("=========================================");




    }


}
