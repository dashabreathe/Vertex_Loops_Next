/* Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже.
 *****
 *****
 *****
 */

public class Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
