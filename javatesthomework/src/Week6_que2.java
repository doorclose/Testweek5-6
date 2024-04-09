public class Week6_que2 {

    //**      2.1 Declare two static variables.  **//

  static int variable1 = 234;
  static int variable2 = 453;

  //*** 2.2 Declare one static method.  ***//
    static void printVariables(){

        //** 2.3 Call both static variables into the static method inside the print statement.** //

        System.out.println("static variable1 =>" + variable1 );
        System.out.println("static variable2 => " + variable2);
    }

    //2.4 Declare the Main method.
    public static void main(String[] args) {

        //2.5 Call the static method into the Main method and run the programme.
        Week6_que2 k = new Week6_que2();
        k.printVariables();
    }

}
