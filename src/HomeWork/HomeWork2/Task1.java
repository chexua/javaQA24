package HomeWork.HomeWork2;

public class Task1 {
    //В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
    //■ результат целочисленного деления x на y;
    //■ остаток от деления x на y;
    //■ квадратный корень x.

    public static void main(String[] args) {
        int x = 21;
        int y = 5;


        int delX = x/y;
    System.out.println("результат целочисленного деления x на y = " + delX);

        int ostatok = x % y;
    System.out.println("остаток от деления x на y = " + ostatok);

        double koren = Math.sqrt(x);
    System.out.println("квадратный корень x = " + koren);



    }
}
