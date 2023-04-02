package classwork.les1.Les2;

import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1е число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите 2е число: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println((double)num1 / num2);

        int num3 = 130;
        byte num4 = (byte) num3;
        System.out.println("num4 = " + num4);




    }
}
