/* Anthony Karim
*  Lab3: calculatrice
*  Date de remise: 15 janvier 2024
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(myScanner.nextLine());

        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(myScanner.nextLine());

        System.out.print("Select an operation (+, -, *, /): ");
        String operation = myScanner.nextLine();

        int result = 0;

        switch(operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                try {
                    result = num1 / num2;
                }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation symbol...");
                return;
        }

        System.out.println("The result of the operation is: " + result);

    }
}