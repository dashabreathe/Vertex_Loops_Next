/*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
Например:
если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.*/

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи любое целое положительное число: ");
        int num = scan.nextInt();
        if (num < 1) {
            System.out.println("Невалидный ввод");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}