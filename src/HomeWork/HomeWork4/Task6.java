package HomeWork.HomeWork4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Пользователь вводит с клавиатуры длину линии и символ для заполнения линии. Нужно отобразить на экране
        //вертикальную линию из введенного символа, указанной
        //длины.


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину линии: ");
        int lineL = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String simvol = sc1.nextLine();

        for (int i = 0; i < lineL; i = i + 1) {
        System.out.println(simvol);

    }
        }
    }

