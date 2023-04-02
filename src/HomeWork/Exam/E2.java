package HomeWork.Exam;

public class E2 {
    public static void main(String[] args) {
        //Используя цикл while необходимо вывести на экран следующую последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98.

        var i = 0;
        var n = 0;
        while (i <= 13){
            n = n + 7;
            i = i + 1;
            System.out.print(n+" ");

        }
    }
}
