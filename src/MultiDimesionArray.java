import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
