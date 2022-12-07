import java.util.Scanner;

public class RecPrime {
    static void prime(int sayi) {
        boolean isPrime = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.print(sayi + " asal değildir.");
        } else
            System.out.print(sayi + " asal sayıdır.");

    }

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin:");
        sayi = input.nextInt();
        prime(sayi);
    }
}
