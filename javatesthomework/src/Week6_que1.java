public class Week6_que1 {

    //1.1 Declare two instance variables.//

    int variable1 = 4 ;//instance global variable
    int variable2 = 34 ;

    //1.2 Declare one instance method.//

    void printVariables(){

        //1.3 Call both instance variables into the instance method inside the print statement.//

        System.out.println("Instance variable1 =>" + variable1 );
        System.out.println("Instance variable2 => " + variable2);
    }


    //          1.4 Declare the Main method.//
    public static void main(String[] args) {

        //        1.5 Call the above instance method into the Main method and run the programme.//

        Week6_que1 obj = new Week6_que1();
        obj.printVariables();
    }

}
