package HomeWork.HomeWork3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Задание 6
        //Определить количество дней в году, который вводит
        //пользователь, и вывести их в консоль. В високосном году –
        //366 дней, тогда как в обычном – 365. Високосными годами
        //являются все годы, делящиеся нацело на 4, за исключением
        //столетий, которые не делятся нацело на 400.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
         int a;
         a = sc.nextInt();

         int b = a % 400;
         int c = a % 100;
         int d = a % 4;
         if (d < 1 && c >= 1) {
            System.out.println("Вискосный год, в этом году 366 дней");
        } else if (b < 1) {
            System.out.println("Високосный год, в этом году 366 дней");
        } else {
            System.out.println("Не високосный год, в этом году 365 дней");
        }
    }
}
