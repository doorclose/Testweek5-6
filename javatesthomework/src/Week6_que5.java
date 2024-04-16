import java.text.DecimalFormat;
import java.util.Scanner;

public class Week6_que5{
    //Write a program to enter any radius value of the circle and find out the area. (Formula
    //of Area A=PI*r*r).//
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        float r=sc.nextFloat();
        double area=Math.PI*Math.pow(r,2);
        double per=2*Math.PI*r;

        DecimalFormat df = new DecimalFormat(("-->>>"));
        System.out.println("Area:" +area);


    }
}
