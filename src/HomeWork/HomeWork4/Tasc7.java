package HomeWork.HomeWork4;

import java.util.Scanner;

public class Tasc7 {
    public static void main(String[] args) {

        //Пользователь вводит с клавиатуры два числа (начало и
        //конец диапазона). Требуется проанализировать все числа
        //в этом диапазоне. Вывод на экран должен проходить по
        //правилам, указанным ниже.
        //Если число кратно 3 (делится на 3 без остатка) нужно
        //вывести слово «Fizz». Если число кратно 5 нужно вывести
        //слово «Buzz». Если число кратно 3 и 5 нужно вывести
        //«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
        //само число.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало диапазона: ");
        int a = sc.nextInt();

        System.out.println("Введите конец диапазона: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Числа не могут быть одинаковыми!");
        }

        for (int i = a; i < b; i++)
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizz Buzz");

                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }

            }
    }
}





