package HomeWork.HomeWork8;

public class T2 {
    public static void main(String[] args) {
        //Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.

        int[] arr = {1, 3, 5, 6, 8};
        MetMax(arr);
    }

    public static void MetMax(int[] arr) {

        int m = 0;

        for (int i = arr[0]; i <= arr[4]; i++) {
            m = Math.max(arr[0], arr[4]);

        }
        System.out.println("максимума в массиве = " + m);
    }
}


