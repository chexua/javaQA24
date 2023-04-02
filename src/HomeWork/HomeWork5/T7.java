package HomeWork.HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        //Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число. Необходимо посчитать
        //сколько раз данное число присутствует в массиве.

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");

        int n = sc.nextInt();
        int c = 0;

        for (int i1 = arr[0]; i1 <= arr[4]; i1++) {
             if (arr[i1] == n) {
                c += 1;
            }

        }
        System.out.println("число присутствует в массиве: " + c + " раз");

    }
}
