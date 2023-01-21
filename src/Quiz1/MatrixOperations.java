package Quiz1;
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{6, 7}, {8, 9}};

        int[][] matrix1transpose = transpose(matrix1);
        System.out.println("MATRIS 1 TRANSPOZ");
        printMatrix(matrix1transpose);

        int[][] matrix2transpose = transpose(matrix2);
        System.out.println("MATRIS 2 TRANSPOZ");
        printMatrix(matrix2transpose);

        int[][] sum = add(matrix1, matrix2);
        System.out.println("MATRIS 1 VE 2 TOPLAMI");
        printMatrix(sum);

        int[][] difference = subtract(matrix1, matrix2);
        System.out.println("MATRIS 1 VE 2 ÇIKARIMI");
        printMatrix(difference);
    }
    public static int[][] transpose(int[][] matrix1){
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] transpose = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transpose[j][i] = matrix1[i][j];
            }
        }
        return transpose;
        }
    public static int[][] add(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sum = new int[rows][columns];
        for (int i = 0; i<rows;i++){
            for (int j =0; j<columns; j++){
                sum[i][j]  = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
        }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2)  {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] difference = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    difference[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return difference;
        }

        public static void printMatrix(int[][] matrix) {
            int rows = matrix.length;
            int columns = matrix[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}
