import java.util.Scanner;

public class OnIki {
    public static void main(String[] args) {
        int sayi, i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı girin: ");
        sayi = input.nextInt();

        while (i <= sayi) {
            if (i % 12 == 0) {
                System.out.println(i);
            }
            i++;

        }
    }
}
