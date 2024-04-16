package week7homework;

public class Week7_Que22 {


    public static void main(String[] args) {
                int[] number = {10, 21, 32, 43, 56};
                int sum = 0;

                int i;
                for (i = 0; i < number.length; i++){
                    sum = sum + number[i];

                }
                double average = (double) sum/number.length;
                System.out.println("Sum of all array is :->" + average );
            }
        }




