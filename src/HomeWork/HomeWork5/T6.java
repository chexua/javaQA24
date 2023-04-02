package HomeWork.HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class T6 {


    public static void main(String[] args) {
        //Пользователь с клавиатуры вводит элементы одномерного массива. Необходимо найти сумму элементов
        //массива, среднеарифметическое, отобразить на экран все
        //элементы массива.

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int s = 0;
        int c = 0;

        for (int i1 = arr[0]; i1 <= arr[4]; i1++){
             s += arr[i1];
             c++;
        }
        System.out.println("Сумма элементов массива = " + s);
        double average = (double) s / c;
        {
            System.out.println("среднеарифметическое = " + average);
        }
    }
}





