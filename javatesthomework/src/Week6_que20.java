public class Week6_que20 {
    static String Country1 = "Spain";
    String country2 = "United kingdom";

    void HomeCountryMethod() {

        System.out.println("Europian county :--> " + Country1);
    }

    //20.4 Declare static method name holidays() and call instance variable
    static void HolidaysMethod() {

        Week6_que20 H = new Week6_que20();
        System.out.println("My homecountry :-->>" + H.country2);
    }

    //20.5 Call both methods in main method.

    public static void main(String[] args) {


        Week6_que20 H = new Week6_que20();
        H.HomeCountryMethod();
        HolidaysMethod();
    }
}