package week7homework;
//Write a Java program to sum values of an array.
public class Week7_Que21 {

    public static void main(String[] args) {
        int[] number = {10, 21, 32, 43, 56};
        int sum = 0;

        int i;
        for (i = 0; i < number.length; i++){
            sum = sum + number[i];

        }

        System.out.println("Sum of all array is :->" + sum );
    }
}
