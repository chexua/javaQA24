package HomeWork.HomeWork2;

public class Task5 {

    public static void main(String[] args) {

        // Подсчитать площадь и длину окружности для круга с радиусом R. Радиус должен быть задан константой в программе.
        // Вывести результат на консоль.

        int radius = 3;
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        double lkruga = Math.PI * 2*radius;
        System.out.println("Длины окружности равна: " + lkruga) ;
    }
}
