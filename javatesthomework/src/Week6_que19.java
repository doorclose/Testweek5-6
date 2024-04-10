public class Week6_que19 {

    //Declare one of your group member names as instance variable.
    //Declare one of your group member names as static variable.

    String Name1  = "Clair";
    static String Name2 = "John";

    //19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    //variables.

    void SeleniumMethod(){

        System.out.println("Group Member name :-->" +Name1);
        System.out.println("Group Member name:-> " +Name2) ;
    }

    //19.4 Declare static method name agile() and call both variable
    static void Agile(){
        Week6_que19 A = new Week6_que19();
        System.out.println("Group Member name :-->" +A.Name1);
        System.out.println("Group Member name:-> " +Name2) ;

    }

    //19.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        Week6_que19 A = new Week6_que19();
        A.SeleniumMethod();
        Agile();
    }
}
