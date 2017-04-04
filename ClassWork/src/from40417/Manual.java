package from40417;

import java.util.Scanner;

/**
 * Created by ioa on 04.04.17.
 */
public class Manual {
    public void ifelse(){
        System.out.println("if else");
    }
    public void switchman(){
        System.out.println("switch(blabla)");
    }
    public static void main(String[] args) {
        Manual n = new Manual();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.print("Справка по: " + "\n1. if \n" + "2. switch");
        while (i>0){
            int s = scanner.nextInt();
            if (s == 1){
                n.ifelse();
            }
            if (s==2){
                n.switchman();
            }
        }
        System.out.println();
    }
}
