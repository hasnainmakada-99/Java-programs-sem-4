import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        String decimalNumber = scanner.nextLine();

        // Extract the integer part and fractional part from the decimal number.
        int integerPart = Integer.parseInt(decimalNumber.split("\\.")[0]);
        int fractionalPart = Integer.parseInt(decimalNumber.split("\\.")[1]);

        // Convert the integer part and fractional part to fractions.
        int numerator = integerPart;
        int denominator = 10;
        for (int i = 0; i < fractionalPart; i++) {
            denominator *= 10;
        }

        // Create a fraction object.
        Fraction fraction = new Fraction(numerator, denominator);

        // Print the fraction.
        System.out.println("The fraction is: " + fraction);
        scanner.close();
    }
}

class Fraction {

    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator+" / "+denominator;
    }
}