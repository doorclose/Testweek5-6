package week7homework;
//Reverse Word
public class Week7_Que26 {
    public static void main(String[] args) {

        String name = "Kinjal";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}