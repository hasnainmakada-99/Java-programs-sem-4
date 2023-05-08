public class p11 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random rand = new Random();
        
        // Generate random 0's and 1's for each element in the matrix
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }
        
        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Check if every row has an odd number of 1's
        for (int i = 0; i < 6; i++) {
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Row " + (i+1) + " does not have an odd number of 1's");
            }
        }
        
        // Check if every column has an odd number of 1's
        for (int j = 0; j < 6; j++) {
            int count = 0;
            for (int i = 0; i < 6; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Column " + (j+1) + " does not have an odd number of 1's");
            }
        }
    }
    
}
