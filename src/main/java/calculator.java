import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator App");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Please select an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        switch(operator) {
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
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
