package calculate;

import java.util.Scanner;

public class Main {

    //Main method
    public static void main(String[] args) {

        char result; //Local variable

        Scanner input = new Scanner(System.in); //Scanner object
        Calculator cal = new Calculator();  //calculator class object

        do {
            System.out.print("Enter first Number: \t");
            int a = input.nextInt();
            System.out.print("Enter second Number: \t");
            int b = input.nextInt();
            System.out.print("“Please enter one of symbol +,-,*, /: \t");
            char symbol = input.next().charAt(0);

            cal.calculateResult(a, b, symbol);  //call calculateResult method via cal object

            System.out.println("Would you like to do more calculation Please enter Y for yes or N for no :");
            result = input.next().charAt(0);
        } while (result == 'y' || result == 'Y');

        System.out.println("Program End");
    }
}
