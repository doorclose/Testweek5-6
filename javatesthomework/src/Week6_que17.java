public class Week6_que17 {

  //  17.1 Declare your city as instance variables.

    String city = "Bombay" ;
     //  17.2 Declare your country as static variables.
    static String Country  = "India";

    //17.3 Declare one instance method and call static variable in print statement

    void PrintCity(){

        System.out.println("static Country :-->> " + Country);

 }

       //17.4 Declare static method and call instance variable in print Statement.
         static void PrintCountry(){

           Week6_que17 C = new Week6_que17();
             System.out.println("String city:->> " + C.city);
    }

    // 17.5 Call both user defined methods into main method.
      public static void main(String[] args) {
          Week6_que17 C = new Week6_que17();
          C.PrintCity();
          PrintCountry();

    }


}
