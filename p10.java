
public class p10 {
    static int reverse(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        int reversedNumber = reverse(1234567);
        System.out.println(reversedNumber);
    }

}
