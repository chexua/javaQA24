package HomeWork.HomeWork6;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        //Ввести с клавиатуры строку текста, а затем один символ.
        //Показать на консоль индексы и количество совпадений (ищем
        //вхождения символа в строку). В случае если совпадений не
        //найдено, вывести соответствующий текст.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        System.out.println("Введите символ: ");
        String sum = in.nextLine();
        System.out.println("Длина строки = " + str.length());

        char[] chars = str.toCharArray();
        System.out.print(Arrays.toString(chars));
        char sim = sum.charAt(0);

        for (int i = 0; i < chars.length; i++){
        System.out.println(chars[i]);
}
        System.out.println("\n" + Arrays.toString(chars));

        int count = 0;
        for (int i=0; i<str.length();i++){
            if (chars[i]==sim){
                count++;
                System.out.println("индекс совпадений: " + i);
            }
        }
        System.out.println("Кол-во совпадений = "+count);





    }
}
