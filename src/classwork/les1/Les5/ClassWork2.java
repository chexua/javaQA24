package classwork.les1.Les5;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        //Задание 3
        //Пользователь вводит с клавиатуры строку, слово для поиска, слово для замены.
        //Произведите в строке замену одного слова на другое. Полученную строку отобразите на экране.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:  ");
        String str = sc.nextLine();
        System.out.println("Введите слово на замену:  ");
        String str1 = sc.nextLine();
        System.out.println("Введите слово на которое меням:  ");
        String str2 = sc.nextLine();
        System.out.println("replace = " + str.replace(str1, str2));




    }
}
