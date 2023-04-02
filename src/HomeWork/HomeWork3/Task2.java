package HomeWork.HomeWork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //  С клавиатуры вводится время (количество часов от 0 до
        //24) – программа выводит приветствие, соответствующее
        //введенному времени (например, ввели 15 часов – выводится
        //приветствие «Добрый день»).

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в часах: ");
        int hour = sc.nextInt();

        if (hour < 6 || hour == 24) {
            System.out.println("Доброй ночи!");
        } else if (hour >= 6 && hour < 12) {
            System.out.println("Доброе утро!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день!");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("ТАКОГО ВРЕМЕНИ СУТОК НЕ СУЩЕСТВУЕТ!");
        }
    }
}
