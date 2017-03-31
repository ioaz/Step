package from_300317;

import java.util.Random;

/**
 * Created by ioa on 30.03.17.
 */
public class ClassWork {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
/*
        System.out.println("Транспонирование: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }*/
        System.out.println("Змейкой");


        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                for (int j = arr.length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}

