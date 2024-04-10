public class Week6_que18 {
       //Declare your council name as static variables.
       // Declare your house number as instance variables.
    static String Council = "hillingdon";
    int Housenum = 12;
    //Declare one instance method name borough() and call Static variable
    void Borough() {
        System.out.println("This is  :-->" + Council + "borough");
    }
//Declare static method name address() and call instance variable

    static void Address(){
        Week6_que18 a = new Week6_que18();
        System.out.println("Address :->"+ a.Housenum);

    }
          //Call both user defined methods into main method.
    public static void main(String[] args) {
        Week6_que18 a = new Week6_que18();
        a.Borough();
        Address();
    }
}
