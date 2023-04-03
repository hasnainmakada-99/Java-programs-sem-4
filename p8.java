import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scan.nextInt();
        int divisibleby = 2;
        while (number > 1) {
            if (number % divisibleby == 0) {
                System.out.print(divisibleby + "  ");
                number /= divisibleby;
            } else {
                divisibleby++;
            }
        }

        scan.close();

    }
}
