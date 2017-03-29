package from_160317;

import java.io.*;

/**
 * Created by ioa on 14.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        int hex = 0xf0;
        System.out.println(hex + " Invert " + ~hex);
        System.out.println(hex + " Minus " + -hex);
        System.out.println(hex + " Increment " + ++hex);
        System.out.println(hex + " 0мсDecrement " + --hex);

    }
}
/*
        String one = args[0];
        if (one.equals("Hello"))
            System.out.println("World");
        else
            System.out.println("Hello from Java");

    }
}



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n+1];
        for (int k = 1; k < n; k++) {
            for (int j = k; j < n; j++) {
                int m = matrix[j][k - 1] / matrix[k - 1][k - 1];
                for (int i = 0; i <= n; i++) {
                    matrix[j][i] = matrix[j][i] - m * matrix[k - 1][i];
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            int[] x = new int[i];
            x[i] = matrix[i][n] / matrix[i][i];
            if (i != -1) {
                x[i] -= matrix[i][n + 1] * x[n + 1] / matrix[i][i];
            }

        }
    }
}

//прочитать про ввод строк из кансоли! и попробовать поработь.


        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (i>0) {
            int a = Integer.parseInt(reader.readLine());
            if ((a % 5) == 0)
                System.out.println("Bingo");
            }


        int queueSize = 15;
        switch (queueSize % 5){
            case 0:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Big");
                break;
            default:
                System.out.println("nonono");
        }

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " четное");
            } else {
                System.out.println(arr[i] + " не четное");
            }
        }


        //int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int i = 0;
        while (i<arr.length){
            if (arr[i]%2==0) {
                System.out.println(arr[i] + " четное");
            }
            else if (arr[i]%2==1){
                System.out.println(arr[i] + " не четное");
            }
            i++;
        }
        */

