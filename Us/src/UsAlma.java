import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int taban, us , cevap = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin:");
        taban = input.nextInt();
        System.out.print("Üs değerini girin:");
        us = input.nextInt();

        for(int i=1 ; i <= us ; i++){
            cevap *= taban;
        }
        System.out.print("Cevap: " + cevap);
    }
}
