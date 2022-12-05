import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2, k;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin:");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı girin:");
        sayi2 = input.nextInt();
        k = sayi1;
        int ebob = 1, ekok;

        while (k <= sayi1){
            if (sayi1 % k == 0 && sayi2 % k == 0){
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("EBOB:" +ebob);
        ekok = sayi1* sayi2 / ebob;
        System.out.println("EKOK:" +ekok);

    }
}
