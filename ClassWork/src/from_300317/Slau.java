package from_300317;

import java.io.IOException;

/**
 * Created by ioa on 30.03.17.
 */
public class Slau {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(reader.readLine());
        //float[][] matrix = new float[n][n];
        //Random random = new Random();
        float[][] matrix =   {{9,2,3},
                              {4,5,6},
                              {7,8,9}};
        /*float[][] matrix = new float[3][3];

        int f = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //  matrix[i][j] = random.nextInt(10);
                matrix[i][j] = f;
                f++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
        float m;
        /*
        int j0 = matrix[1][0] / matrix[0][0]; // 4 / 1 = 4
        System.out.println("     j0 = " + j0);
        int i0  = matrix[1][0] - j0 * matrix[0][0]; //4-4*1 = 0
        System.out.println("0 = "+i0);
        i0  = matrix[1][1] - j0 * matrix[0][1]; //5-4*2 = -3
        System.out.println("1 = "+i0);
        i0  = matrix[1][2] - j0 * matrix[0][2]; //6-4*3 = -6
        System.out.println("2 = "+i0);

        int j1 = matrix[2][0] / matrix[0][0]; // 7 / 1 = 7
        System.out.println("     j1 = " + j1);
        i0  = matrix[2][0] - j1 * matrix[0][0]; //7-7*1 = 0
        System.out.println("0 = "+i0);
        i0  = matrix[2][1] - j1 * matrix[0][1]; //8-7*2 = -6
        System.out.println("1 = "+i0);
        i0  = matrix[2][2] - j1 * matrix[0][2]; //9-7*3 = -9
        System.out.println("2 = "+i0);

        int j2 = -6 / -3;
        System.out.println("      j2 = " + j2);
        */

        System.out.println();

        // Приведение расширенной матрицы к ступенчатому виду (прямой ход)
        for (int k = 1; k < matrix.length; k++) { //этот цикл определяет строку (начинается со второй)
            for (int j = k; j < matrix.length; j++) { // этот определяет первый элемент в строке
                m = (matrix[j][k - 1] / matrix[k - 1][k - 1]); // вычисляется делитель
                //System.out.println("m = " + m);
                for (int i = 0; i < matrix.length; i++) { // этот проходит по строке и
                    matrix[j][i] = matrix[j][i] - m * matrix[k - 1][i]; // отнимает строку от строки умноженную на делитель
                    // и заносит результаты в матрицу
                    //   System.out.print(matrix[j][i] + " ");
                }
                // System.out.println();
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*float v = (int) (matrix[1][matrix.length-2] / matrix[1][1]);
        System.out.println("i !="+v);
        v -= matrix[1][matrix.length-1] *
                2/matrix[1][1];
        System.out.println(v);

        float[] x = new float[3];
        float x1;
        float x2;
        float x3;
        x1 = matrix[1][2] / matrix[2][2];
        System.out.println(x1);
        x1 = matrix[0][2] / matrix[1][1];
        System.out.println(x1);
        x1 = matrix[0][2] / matrix[0][0];
        System.out.println(x1);
*/
        float[] x = new float[matrix.length];

        for (int i = matrix.length - 1; i >= 0; i--) {
            x[i] = matrix[i][matrix.length-1] / matrix[i][i];
            //System.out.print("x " + x[i] + " ");
            if (i != matrix.length - 1) {
                x[i] -= matrix[i][i + 1] * x[i + 1] / matrix[i][i];
                //System.out.println("x2 "+x[i]);
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("x" + (i + 1) + ": " + x[i]);

        }
    }
}
