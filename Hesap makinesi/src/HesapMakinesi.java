import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin:");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin:");
        sayi2 = input.nextInt();

        System.out.print("Lütfen bir işlem seçin:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n\n");
        islem = input.nextInt();

        switch (islem){
            case 1 :
                System.out.print("TOPLAMA İŞLEMİ SONUCU: " + (sayi1 + sayi2));
                break;

            case 2 :
                System.out.print("ÇIKARMA İŞLEMİ SONUCU: " + (sayi1 - sayi2));
                break;

            case 3 :
                System.out.print("ÇARPMA İŞLEMİ SONUCU: " + (sayi1 * sayi2));
                break;

            case 4 :
                if (sayi2 != 0)
                    System.out.print("BÖLME İŞLEMİ SONUCU: " + ((double)sayi1 / (double)sayi2));
                else
                    System.out.print("Bölme işleminde payda kısmı 0 olamaz");

                break;

            default :
                System.out.print("Lütfen 1-4 arasında bir işlem seçin!");
        }
    }
}
