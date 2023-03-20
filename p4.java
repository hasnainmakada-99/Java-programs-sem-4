import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number in meters : ");
        int number = scanner.nextInt();

        double feet = number * 3.2808399;

        System.out.println("The number in feet : " + feet);

        scanner.close();
    }

}
