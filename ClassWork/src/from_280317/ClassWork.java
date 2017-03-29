package from_280317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ioa on 28.03.17.
 */
public class ClassWork {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = 1;
        while (r>0) {
            System.out.println("ввидите слово:\n ");
            String s = reader.readLine();
            char[] chararray = s.toCharArray();
            //System.out.println(Arrays.toString(chararray));
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (chararray[i] == chararray[chararray.length - i - 1]) {
                    counter++;
                    //System.out.println(chararray[i] + chararray[chararray.length-i-1]);
                    //System.out.println(counter);
                }
                if (chararray.length == counter) {
                    System.out.println("\"" + s + "\" - " + "это полиндром!\n");
                }


            }
            if (chararray.length > counter)
                System.out.print("еще разок  ");





        }

        /*int i = 1;
        int sum = 0;
        int n = 10;

        do {
                sum += i++;
        }
        while (i<n);

        System.out.println(" = " + sum);


        //********************************
/*
        int i2 = 2;
    int n1=7;
        boolean isPrime = true;
        do {
            if (n1%i2 == 0){
                isPrime = false;
            }
        } while (++i2 < n1);
        System.out.println(isPrime);

    int[] arr = {1,2,3,4,5,6,7,8,9,10};

    for (int i = arr.length-1; i >= 0; i--){
        System.out.print(arr[i] + " ");
        }

        int sum = 0, n = 90;
        for(int i = 1; i < 1000; i++){
            if (i*(i+1) == n) {
                sum = i+i+1;
                System.out.println(i + " " + (i+1));
                break;
            }
        }
        if (sum > 0)
            System.out.println(sum);



                // System.out.println(arr2[i]);
            }
        }
        //System.out.println(arr2[arr2.length/2] + " " + arr2[arr2.length-1]);



/*
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = random.nextInt(10);
            }
        }
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонирование: ");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }*/
    }
}
