package from_210317;

/**
 * Created by ioa on 21.03.17.
 */
public class ClassWork {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        //Задание 1
        int x = 53, y = 17;
        System.out.println("Остаток от деления = " + x%y);

        //Задание 2
        System.out.println("\nЗадание 2");
        int num = 7777;
        int sum = 0;
        for (sum = 0; num!=0; num /= 10){
            sum += num % 10;
            //System.out.println(sum);
        }
        System.out.println(sum);

        //Задание 3

        System.out.println("\nЗадание 3");
        double nam2 = 2.51;
        double nam21 = nam2 * 10;
        double nam3 = nam21%10;
        int nam22 = 0;
        if (nam3>=5) {
            //System.out.println(nam2);
            nam2 += 0.5;
            nam22 = (int) nam2;
            System.out.println("Округление в большую сторону: " + (nam2-0.5) + " = " + nam22);
        }
        else {
            nam22 = (int) nam2;
            System.out.println("Округление в меньшую сторону: " + nam2 + " = " + nam22);
        }

        //Площадь круга
        System.out.println("\nЗадание 4");
        final double pi = 3.1415;
        double S;
        int r = 60;
        S =  (pi * (Math.pow(r, 2)));
        System.out.println("Площадь круга = " + S);

        //Задание 4
        System.out.println("\nЗадание 5");
        double day=0, hours=0, minuts=0, sekonds=0, left = 23856333;

        day = left / (60*60*24);
        hours = left % (60*60*24)/(60*60);
        minuts = left % (60*60*24)%(60*60)/60;
        sekonds = left % (60*60*24)%(60*60)%60;
        System.out.println("До нового года осталось: " + day + " дней, " + hours + " часов, " +
                                                    minuts + " минут, " + sekonds + " секунд.");

        //Задание 6
        System.out.println("\nЗадание 6");

        final int child60 = 35*60/100;
        final int child100 = 35;
        int milkpak = (int) Math.round(((child100 * 0.2)/0.9));
        int perkol = child100 * 2;
        System.out.println("Для 100% учеников с весом меньше 30 кг.: \n" + perkol +
                " пирожков \n" + milkpak + " пакетов молока\n");
        milkpak = (int) Math.round(((child60 * 0.2)/0.9));
        perkol = child60 * 2 + (child100-child60);
        System.out.println("Для 60% учеников с весом меньше 30 кг.: \n" + perkol
                + " пирожков \n" + milkpak + " пакетов молока");



    }
}
