package HomeWork.HomeWork4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Задание 4
        //Пользователь вводит с клавиатуры два числа. Нужно
        //посчитать сумму чисел в указанном диапазоне, а также
        //среднеарифметическое.



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-ое число: ");
        int first = sc.nextInt();
        System.out.println("Введите 2-ое число: ");
        int second = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = first; i < second; i++) {
            sum = sum + i;
            count++;

        }
        System.out.println("сумма всех чисел = " + sum);
        double av = (double) sum / count;
        System.out.println("среднеарифметическое  = " + av);











        }
    }

