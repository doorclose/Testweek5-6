public class Week6_que4 {

    //4.1 Declare two instance and two static variables.

    int Instancevariable1 = 30;
    int Instancevariable2 = 40;

    static int staticvariable3 = 50;
    static int staticvariable4 = 60;

    //4.2 Declare one instance method.

    void instanceMethod() {

        // 4.4 Call all four instance and static variables into both instance and static methods inside the
        //  print statement.//

        System.out.println("Instance variable== =>" + Instancevariable1);
        System.out.println("Instance variable== =>" + Instancevariable2);
        System.out.println("Static variable => " + staticvariable3);
        System.out.println("Static variable => " + staticvariable4);

    }

    //4.3 Declare one static method.//
    static void staticMethod() {

        Week6_que4 r = new Week6_que4();
        Week6_que4 j = new Week6_que4();

        System.out.println("Instance variable =>" + r.Instancevariable1);
        System.out.println("Instance variable =>" + j.Instancevariable2 );
        System.out.println("Static variable => " + staticvariable3);
        System.out.println("Static variable => " + staticvariable4);
    }
//4.5 Declare the Main method.
    public static void main(String[] args) {

        //4.6 Call both instance and static methods into the Main method and run the programme.
        Week6_que4 r = new Week6_que4();
        r. instanceMethod();

        Week6_que4 j = new Week6_que4();
        j. instanceMethod();
        staticMethod();

    }
}