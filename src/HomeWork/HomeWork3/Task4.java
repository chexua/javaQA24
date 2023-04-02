package HomeWork.HomeWork3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Задание 4
        //Дана точка на плоскости заданная координатами x и y,
        //определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой)
        //системе координат.
        //Четверти обозначены римскими цифрами.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x: ");
          int x = sc.nextInt();
        System.out.println("Введите координату x: ");
          int y = sc.nextInt();

          if (x > 0 && y > 0) {
              System.out.print("I");}
          else if (x < 0 && y > 0) {
                  System.out.print("II");
              } else if (x < 0 && y < 0) {
                  System.out.print("III");
              } else if (x > 0 && y < 0) {
                  System.out.print("IV");

          }
    }
}
