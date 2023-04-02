package HomeWork.HomeWork2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // Есть прямоугольник, у которого известна ширина w и
        //высота h. Найти и вывести на консоль периметр и площадь
        //заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
        //программы.

            final int w;
            final int h;

             w = 5;
             h = 7;

            int s = w * h;
            int p = (w + h) * 2;

        System.out.println("периметр прямоугольника = " + s);
        System.out.println("площадь прямоугольника = " + p);
    }
}
