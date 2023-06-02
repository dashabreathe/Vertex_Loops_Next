
/*Необходимо вывести на экран таблицу умножения на 3:
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30 */

public class Loop3 {
    public static void main(String[] args) {
        int[] multiplier = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < multiplier.length; i++) {
            System.out.println("3*" + multiplier[i] + "=" + 3 * multiplier[i]);
        }
    }
}
