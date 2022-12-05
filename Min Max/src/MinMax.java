import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int adet, deger, max = 0,min = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?:");
        adet = input.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(+i + ". sayıyı girin:");
            deger = input.nextInt();
            if (deger > max) {
                max = deger;
            }
            if (deger < min){
                min = deger;
            }
        }

        System.out.println("EN KUCUK DEGER :" +min);

        System.out.println("EN BUYUK DEGER :" +max);
    }
}
