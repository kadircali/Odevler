package odevler;

public class MatrisTranspoz {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        
        int rows = matrix.length;
        int columns = matrix[0].length;

        
        int[][] transposeMatrix = new int[columns][rows];

       
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        
        
       
        System.out.println("Matris: ");
        printMatrix(matrix);

        System.out.println("Matrisin transpozu: ");
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
