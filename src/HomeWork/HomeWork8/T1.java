package HomeWork.HomeWork8;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        //Напишите метод, вычисляющий сумму элементов
        //массива. Массив передаётся в качестве параметра.


        int[] arr = {1, 3, 5, 6, 8};
        MetSum(arr);

        }


    public static void MetSum (int[] arr) {

        int s = 0;


       for (int i = arr[0]; i < arr.length; i++) {

            s += arr[i];

        }
        System.out.println("Сумма элементов массива = " + s);
    }

}


