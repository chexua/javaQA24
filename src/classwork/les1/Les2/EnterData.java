package classwork.les1.Les2;

import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {

        int age = 19;
        System.out.println("Начальное значение age = " + age);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя ");
        String name = scanner.nextLine();//ввод строки
        System.out.println("Ваше имя =  " + name);


        System.out.println("Сколько тебе лет?");
        age = scanner.nextInt();//ввод целого числа с консоли, результат пишем в переменную age
        System.out.println("Вам " + age + " лет");

        System.out.println("Введите дробное число");
        double d = scanner.nextDouble();//ввод дробного числа
        System.out.println("Ваше число = " + d);

        //если строку нужно ввести в конце
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner1.nextLine();
        System.out.println(str);


        // / деление
        // + сложение
        // - вычитание
        // * умножение
        System.out.println(age * d);//произведение

    }
}
