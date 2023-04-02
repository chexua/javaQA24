package HomeWork.HomeWork4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры длину линии.
        //Нужно отобразить на экране горизонтальную линию из *,
        //указанной длины.
        //Например, если было введено 7, тогда вывод на экран
        //будет такой:
        //*******

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину линии: ");
        int lineL = sc.nextInt();

        for (int i = 0; i < lineL; i = i + 1) {
            System.out.print("*");

        }
    }
}
