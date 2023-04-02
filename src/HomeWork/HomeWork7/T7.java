package HomeWork.HomeWork7;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры любую строку.
        //Поменять в исходной строке все большие буквы на
        //маленькие, а маленькие – на большие. Если в строке присутствуют цифры, заменить на символ подчеркивания и
        //вывести результат на консоль.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        char[] chars=str.toCharArray();

        for (int i=0; i< chars.length; i++){
            if (Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }   else if (Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }   else if (Character.isDigit(chars[i])){
                    chars[i]='_';

            }

        }
        String srtNew=String.copyValueOf(chars);
        System.out.println(srtNew);
        }




    }
