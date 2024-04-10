public class Week6_que5Cal {

    //5. Write a program for a calculator with addition, subtraction, multiplication, and division
    //methods all with parameters and use string concatenation methods. (Note: Two static
    //and Two instance methods.)


        // Static method for addition
        public static String add(double num1, double num2) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }

        // Static method for subtraction
        public static String subtract(double num1, double num2) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }

        // Instance method for multiplication
        public String multiply(double num1, double num2) {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }

        // Instance method for division
        public String divide(double num1, double num2) {
            if (num2 != 0) {
                return num1 + " / " + num2 + " = " + (num1 / num2);
            } else {
                return "Cannot divide by zero";
            }
        }

        public static void main(String[] args) {
            // Creating an instance of Calculator
            Week6_que5Cal Cal = new Week6_que5Cal();

            // Performing addition using static method
            System.out.println("Addition: " + Week6_que5Cal.add(5, 3));

            // Performing subtraction using static method
            System.out.println("Subtraction: " + Week6_que5Cal.subtract(8, 3));

            // Performing multiplication using instance method
            System.out.println("Multiplication: " + Cal.multiply(4, 6));

            // Performing division using instance method
            System.out.println("Division: " + Cal.divide(10, 2));
        }
    }

