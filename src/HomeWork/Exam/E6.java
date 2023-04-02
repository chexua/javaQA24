package HomeWork.Exam;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        //6.Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
        //- 0 – 250: нет скидки
        //- 251 – 500: скидка 5%
        //- 501 – 1000: скидка 10%
        //- 1001 и более: скидка 15%

        Scanner sc=new Scanner(System.in);
        System.out.println("стоимость покупок:");
        var check = sc.nextInt();

        if (check<=250) {
            System.out.println("сумма к оплате: " + check);
        } else if (check>=251 && check<=500) {
            double res = (double)check/100 * 5;
            System.out.println("сумма к оплате с учетом 5% скидки: " + (check - Math.round(res)) + "$");
        } else if (check>=501 && check<=1000) {
            double res = (double) check / 100 * 10;
            System.out.println("сумма к оплате с учетом 10% скидки: " + (check - Math.round(res)) + "$");
        } else if (check>=1001) {
            double res = (double) check / 100 * 15;
            System.out.println("сумма к оплате с учетом 15% скидки: " + (check - Math.round(res)) + "$");

        }
    }
    }






