public class p15{
    public static int bin2Dec(String binaryString) {
        // Check if the string is a valid binary string.
        if (!binaryString.matches("^[01]+$")) {
          throw new NumberFormatException("The string is not a valid binary number.");
        }
      
        // Convert the binary string to a decimal number.
        int decimalNumber = 0;
        for (int i = 0; i < binaryString.length(); i++) {
          decimalNumber = decimalNumber * 2 + binaryString.charAt(i) - '0';
        }
      
        // Return the decimal number.
        return decimalNumber;
      }
      
    public static void main(String[] args) {
        int output = bin2Dec("0011");
        System.out.println("Decimal Number: "+output);
    }
}