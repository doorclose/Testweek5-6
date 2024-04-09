public class Week6_que3 {

    //3.1 Declare one instance and one static variable.//
    int Instancevariable1 = 256;
    static int variable2 = 300;

    //**  3.2 Declare one instance method.**//
    void printVariable1() {

        //3.4 Call both instance and static variables into both instance and static methods inside the//
      // print statement//

        System.out.println("Instance variable =>" +Instancevariable1);
        System.out.println("Static variable => " + variable2);

    }
    //3.3 Declare one static method.//
    static void printVariable2(){

      //3.4 Call both instance and static variables into both instance and static methods inside the
      //print statement.//

        Week6_que3 p = new Week6_que3();

        System.out.println("Instance variable =>" + p.Instancevariable1);
        System.out.println("Static variable => " + variable2);
    }

    //3.5 Declare the Main method.//
     public static void main(String[] args) {

      //3.6 Call both instance and static methods into the Main method and run the programme.//
         Week6_que3 p = new Week6_que3();
          p. printVariable1();
          printVariable2();
    }
}