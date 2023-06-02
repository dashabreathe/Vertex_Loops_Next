
/*Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
первый и второй члены последовательности равны единицам
а каждый следующий — сумме двух предыдущих
То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.*/

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int x;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 9; i++) {
            x = a + b;
            System.out.print(x + " ");
            a = b;
            b = x;
        }
    }
}
