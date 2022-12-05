import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int deger, sayi1 = 1, sayi2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci dizisi kaç elemandan oluşsun:");
        deger = input.nextInt();
        System.out.print(+sayi1 + "," + sayi2);
        for (int i = 3; i <= deger; i++) {
            int temp = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = temp;
            System.out.print("," + temp);
        }
    }
}
