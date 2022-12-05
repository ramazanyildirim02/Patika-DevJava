import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        int deger, basamakSayi, result = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin:");
        deger = input.nextInt();

        while (deger != 0) {
            basamakSayi = deger % 10;
            deger /= 10;
            result += basamakSayi;

        }
        System.out.print("Girdiğiniz sayının basamak değerleri toplamı: " + result);
    }
}