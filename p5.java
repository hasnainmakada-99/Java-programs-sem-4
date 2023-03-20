import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        System.out.println("Enter 3 numbers : ");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted in decreasing order");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d", numbers[i]);
            System.out.println();
        }

        scanner.close();
    }

}
