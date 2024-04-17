package week7homework;
//All String Methods .
public class Week7_Stringmethods {
    public static void main(String[] args) {
        String txt = "Kinjal";
        String txt1 = "India is great country";
        String txt3 = "         Java is fun";

        System.out.println("Lenght of the string is :->" + txt.length());//  Define String length Method

        //Return a char value at the given index number
        System.out.println("character index number " + txt.charAt(3));

        //String concat
        String name2 = " Brahmbhatt";
       // System.out.println(txt + " " + name2);
        System.out.println(txt .concat (name2));

        //String contains( if character found in string)
        System.out.println(txt.contains("Kin"));//true
        System.out.println(name2.contains("par"));//false

        //Strings start with()

        System.out.println(txt .startsWith("Janm")); //false

        //String end with
        System.out.println( txt .endsWith("l"));

        //String equals()
        System.out.println(txt. equals((name2)));

        //indexOf()
        System.out.println(txt1 .indexOf("great"));

        //String is empty()
        System.out.println(txt.isEmpty());

        //replace()

        String txt2 ="Clean World";
        String replacedString = txt2.replace('C','k');
        System.out.println (replacedString);

        //Substring();
        System.out.println(txt2.substring(0,4));

        //toCharArray()

        char[] myArray = txt.toCharArray();
        System.out.println(myArray[0]);

        // String to LowerCase()
        System.out.println(txt.toLowerCase());

        //Uppercase()
        System.out.println(txt.toUpperCase());

        //Trim()

        System.out.println(txt3);
        System.out.println(txt3.trim());

    }

}
