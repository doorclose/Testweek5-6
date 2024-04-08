public class Que_9_operation {
    public static void main(String[] args) {

        //// -5+8*6///


        int x = -5;
        int y = 8;
        int z = 6;

        int Result = x + y * z;

        //Output of ***** a. -5 + 8 * 6 ****//

        System.out.println("Expected Output (a):->>" + Result);

        ///(55+9)%9///

        // b. (55+9) % 9

        int resultb = (55+9) % 9;

        //c. 20 + -3 * 5 / 8

        int resultc = 20 + -3 * 5 / 8;

        // d. 5 + 15 / 3 * 2 - 8 % 3

        int resultd = 5 + 15 / 3 * 2 - 8 % 3;

        //All Result of b, c, d//

        System.out.println("Result of (55+9) % 9 = " + resultb) ;
        System.out.println("Result of 20 + -3 * 5 / 8 = " + resultc);
        System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 = " +resultd);
    }

}