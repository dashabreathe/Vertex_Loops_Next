
/*Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус.
Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ:
у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.*/

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введи ответ: ");
            String str = scan.next();
            if (str.equals("Троллейбус")) {
                System.out.println("Правильно!");
                break;
            } else if (str.equals("Сдаюсь")) {
                System.out.println("Правильный ответ: троллейбус");
                break;
            } else {
                System.out.println("Подумай ешё!");
            }
        }
    }
}
