package HomeWork.Exam;

public class E5 {
    public static void main(String[] args) {
        //5. Найти периметр фигуры по заданным сторонам AB, AС, и CD (см. рисунок)
        //Используйте формулу для расчета гипотенузы прямоугольного треугольника по его катетам.
        // Квадрат гипотенузы равен сумме квадратов катетов.

        int AB = 7;
        int AC = 15;
        int CD = 5;
        double BC = Math.pow(AB,2) + Math.pow(AC,2);
        double BD = Math.sqrt(BC+Math.pow(CD,2));
        double p = AB+AC+CD+BD;

        System.out.println("периметр фигуры = " + p);

    }
}
