package classwork.les1.Les2;

public class Application {
    public static void main(String[]args){

        System.out.print("My name is Dmiyry");//вывод инфы на консоль
        System.out.print(" Я Дмитрий");
        System.out.print("\n - новая строка");
        System.out.println("\t табуляция");
        System.out.println("\t the end");

        // переменные

        System.out.println("Дима, как дела");
        System.out.println("Дима, что у тебя");
        System.out.println("я Дима");

        // тип  название = значение
        String name = "Дима";
        System.out.println(name + "  теперь переменная");

        System.out.println(10 + 20);

        // типы данных
        // целые
        byte age = 44; // 2^8 = 256
        short sh = 9999;  // 2^16 = -2^15 до 2^15-1
        int deg = 1555555555;  //2^32
        long large = 1555555555555555555L;  //2^64

        // дробные
        float f = 2.59F;
        double d = 2.698;

        //символы
        char ch = 'A';

        // логический
        boolean answer = true;  //false


    }
}
