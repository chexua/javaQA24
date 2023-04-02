package HomeWork.Exam;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //4. Составить программу вычисления значения функции:
        // x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5

        Scanner sc = new Scanner(System.in);
        System.out.println("введите а: ");
        int a = sc.nextInt();
        System.out.println("введите b: ");
        int b = sc.nextInt();
        
        double x = 3.56 * Math.pow((a+b),3) - 5.8 * (Math.pow(b,2)) + 3.8 * a - 1.5;

        System.out.println("x = " + x);

    }
}
