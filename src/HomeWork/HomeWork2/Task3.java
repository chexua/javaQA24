package HomeWork.HomeWork2;

public class Task3 {
    public static void main(String[] args) {

        // В переменной n хранится вещественное число, с ненулевой дробной частью.
        // Создайте программу, округляющую число n до ближайшего целого и выводящую результат округления на экран.

        var n = 8.555;   // Начиная с Java 10 в язык было добавлено ключевое слово var, которое также позволяет определять переменную
                         // var ставится вместо типа данных, а сам тип переменной выводится из того значения, которое ей присваивается
                         // P.S. удобно, не нужно замарачиваться с определением переменной


        System.out.println("Результат: " + (int)n);

    }
}
