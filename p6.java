import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u') {
            System.out.println("The Entered character is a vowel");
        } else {
            System.out.println("The Entered character is a consonent");
        }

        scanner.close();

    }

}
