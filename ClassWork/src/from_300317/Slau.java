package from_300317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by ioa on 30.03.17.
 */
public class Slau {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Random random = new Random();

        int[][] matrix = new int[n][n+1];


        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length+1; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int k = 1; k < matrix.length; k++) {
            for (int j = k; j < matrix.length; j++) {
                int m = matrix[j][k-1] / matrix[k-1][k-1];
                //System.out.print("m = " + m);

                for(int i = 0; i <= matrix.length; i++){
                    matrix[j][i] = matrix[j][i] - (m * matrix[k-1][i]);
                    //System.out.print(matrix[j][i] + " ");
                }
               // System.out.println();
            }
        }
        System.out.println();

        int[] x = new int[100];
        for (int i = matrix.length - 2; i >= 0; i--) {
            x[i] = matrix[i][matrix.length-1] / matrix[i][i];
            System.out.print(x[i] + " ");
            if (i != matrix.length-2) {
                x[matrix.length-1] = matrix[i][matrix.length] * x[matrix.length]/matrix[i][i];
                System.out.println("x = " + x[i]);
            }

        }
    }
}
