package HomeWork.Exam;

import java.util.Scanner;

public class E3Switch {
    public static void main(String[] args) {
        //3. На ввод в программу натурального числа из диапазона [1..25]
        // программа выводит это число и согласованное с ним слово «книга».
        // Например, на ввод числа 1 программа выводит «1 книга», на ввод числа 2 — «2 книги» и т. д.

        Scanner sc = new Scanner(System.in);
        System.out.println("введите натуральное число от 1 до 25 : ");
        int book = sc.nextInt();

        switch (book){
            case 1,21 : System.out.println(book + " книга."); break;
            case 2,3,4,22,23,24 : System.out.println(book + " книги."); break;
            case 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 : System.out.println(book + " книг."); break;
            default: System.out.println("Такой книги в нашей библиотеке нет!");

        }

    }
}


