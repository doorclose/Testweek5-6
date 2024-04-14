package week7homework;
//3. Declare multidimensional array and store 5 countries and their capital and print them in
//console.
public class Week7_Que3 {

    public static void main(String[] args) {
        String[][] Country = {{"India,Canada,Australia,Belgium,France"}, {"Delhi,Otava,Canberra,Brussels,Paris"}};

        System.out.println("Country name and Capital");
        for (int b = 0; b < Country.length; ++b) {
            for (int y = 0; y < Country[b].length; ++y)
                System.out.println(Country[b][y]);
            }
        }
    }