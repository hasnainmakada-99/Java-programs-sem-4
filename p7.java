
public class p7 {
    public static void main(String[] args) {
        String pNumber = " " + (char) ((Math.random() * 26) + 65);
        pNumber += (char) ((Math.random() * 26) + 65);
        pNumber += (char) ((Math.random() * 26) + 65);
        pNumber += (int) (Math.random() * 10);
        pNumber += (int) (Math.random() * 10);
        pNumber += (int) (Math.random() * 10);

        System.out.println("The Number Plate Number : " + pNumber);

    }

}