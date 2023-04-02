package HomeWork.HomeWork6;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        //Написать программу, которая создаст строку, в которой
        //находятся все целые числа, начиная с 1, выписаны в одну
        //строку «123456789101112131415...». Строка должна быть
        //длиной не более 1 000 символов.
        //По числу n (введенного с клавиатуры), выведите цифру на
        //n-й позиции (используется нумерация с 1).

                
        String str = "";
        int ind=1;

        while (str.length() <1000){
            str = str + ind;
            ind++;
          }
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число: ");
        int n=sc.nextInt();

        for(int i = 0; i < str.length(); i++){
            if (i==n-1){
                i++;
                System.out.println("Символ =  " + str.charAt(i-1));
            }
        }
        

       



    }
}
