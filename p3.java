
import java.util.Scanner;

// 10ft = 0.3048×10ft = 3.048m.

// Body Mass Index is a simple calculation using a person’s height and weight. The formula is BMI = kg/m 2 where kg is a person’s weight in kilograms and m 2 is their height in metres squared. A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9. BMI applies to most adults 18-65 years.

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the body in pounds: ");
        double weight = scanner.nextDouble() * 0.45359237;
        System.out.println("Enter the height in meters: ");
        double height = scanner.nextDouble() * 0.0254;

        double bmi = (weight / (height * height));

        System.out.println("BMI of the body : " + bmi);

        scanner.close();

    }
}