package HomeWork.Exam;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //3. На ввод в программу натурального числа из диапазона [1..25]
        // программа выводит это число и согласованное с ним слово «книга».
        // Например, на ввод числа 1 программа выводит «1 книга», на ввод числа 2 — «2 книги» и т. д.

        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер книги от 1 до 25 : ");
        int book = sc.nextInt();

            if (book==1 || book==21)
            System.out.println(book + " книга.");
            else if (book==2 || book==3 || book==4) {
                System.out.println(book + " книги.");
            }
            else if (book==22 || book==23) {
                System.out.println(book + " книги.");}
            else if (book==24) {
                System.out.println(book + " книги.");}

            else if (book>4 && book<21 || book==25) {
                System.out.println(book + " книг.");
            }
            else {
                System.out.println("Такой книги в библиотеке нет!");

            }

        }
}
