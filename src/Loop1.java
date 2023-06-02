
// Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5 //

public class Loop1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
