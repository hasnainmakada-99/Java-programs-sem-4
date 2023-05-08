import java.util.*;
public class p13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        // Remove any spaces in the expression
        expression = expression.replaceAll("\\s", "");

        // Find the index of the operator in the expression
        int operatorIndex = 0;
        if (expression.contains("+")) {
            operatorIndex = expression.indexOf("+");
        } else if (expression.contains("-")) {
            operatorIndex = expression.indexOf("-");
        } else if (expression.contains("*")) {
            operatorIndex = expression.indexOf("*");
        } else if (expression.contains("/")) {
            operatorIndex = expression.indexOf("/");
        } else {
            System.out.println("Invalid expression");
            return;
        }

        // Extract the operands from the expression
        double operand1 = Double.parseDouble(expression.substring(0, operatorIndex));
        double operand2 = Double.parseDouble(expression.substring(operatorIndex + 1));

        // Perform the calculation based on the operator
        double result = 0;
        if (expression.charAt(operatorIndex) == '+') {
            result = operand1 + operand2;
        } else if (expression.charAt(operatorIndex) == '-') {
            result = operand1 - operand2;
        } else if (expression.charAt(operatorIndex) == '*') {
            result = operand1 * operand2;
        } else if (expression.charAt(operatorIndex) == '/') {
            result = operand1 / operand2;
        }

        // Print the result
        System.out.println("Result: " + result);
    }
}
