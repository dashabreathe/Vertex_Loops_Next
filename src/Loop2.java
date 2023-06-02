
// Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5 //

public class Loop2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
