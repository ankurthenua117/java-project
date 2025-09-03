
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    input.close();
                    return; 
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                input.close();
                return; 
        }

        System.out.println("Result: " + result);
        input.close();
    }
}