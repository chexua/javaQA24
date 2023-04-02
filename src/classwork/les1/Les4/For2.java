package classwork.les1.Les4;

public class For2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 20;
        for (int i = num1; i < num2; i = i + 1){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
