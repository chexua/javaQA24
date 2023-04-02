package HomeWork.HomeWork1;

public class Task1 {
    //  Метод main() отличается от всех остальных методов тем, что является, как правило, точкой входа в программу.
    //  Этот метод вызывается виртуальной машиной Java. Как только заканчивается выполнение метода main(),
    // так сразу же завершается, тем самым, работа самой программы.
    //  Метод main(), так и любой другой метод, должен быть обязательно вложен в класс.
    public static void main(String[]args)
    {
        String name = " Дмитрий";
        String city = " Днепр";
        String prof = " тестер";
        int age = 44;
        int year1 = 2001;
        int year = 1995;
        int bal = 12;
        double pi = 3.14;



        System.out.println("Здравствуйте! Я" + name);
        System.out.println("Родился в городе" + city + "опетровске");
        System.out.println("Теперь называется: г." + city);
        System.out.println("Мне " + age + " года");
        System.out.println("Закончил школу в " + year + " году");
        System.out.println("c IT начал знакомство в  " + year + " году");
        System.out.println("изучал Visual Basic в " + year1 + " году");
        System.out.println("сейчас хочу освоить профессию " + prof + "а");
        System.out.println("за это ДЗ планирую получить: " + bal);

        System.out.println("путин - " + pi + "*ар!"); // извините за мой росийский



    }
}
