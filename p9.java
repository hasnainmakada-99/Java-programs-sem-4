public class p9 {

    static int gcd(int num1, int num2) {

        int i;
        // Firstly pick the smaller number
        if (num1 < num2) {
            i = num1;

        } else {
            i = num2;
        }

        // decrement the small number till it is greater than or equal to 1
        while (i >= 1) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
            i--;
        }
        return 1;
    }

    public static void main(String[] args) {
        int gcd1 = gcd(30, 10);
        System.out.println("GCD: " + gcd1);
    }
}
