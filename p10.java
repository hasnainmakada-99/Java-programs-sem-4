import java.util.Arrays;
import java.util.Scanner;

public class p10 {

    static int[] reverse(int[] numbers) {
        int[] newReversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newReversed[i] = newReversed[i] * 10 + numbers[i] % 10;
            numbers[i] /= 10;
        }

        return newReversed;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers : ");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(reverse(numbers)));
        scanner.close();
    }

}
