import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int sayi;
        double result = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi; i++){
            result += (1.0 / i );
        }
        System.out.print("Harmonik sonuç: " + result);
    }
}
