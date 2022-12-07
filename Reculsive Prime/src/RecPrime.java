import java.util.Scanner;

public class RecPrime {
    static int prime(int a,int b) {

        if (b == 1) {
            return 1;
        } else {
            {
                if (a % b == 0) {
                    return 0;
                } else {
                    return prime(a, b - 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif sayi giriniz: ");
        int sayi = input.nextInt();

        int bool = prime(sayi,sayi/2);

        if(bool == 1){
            System.out.println(sayi+" Sayi asal ");
        }
        else {
            System.out.println(sayi+" Sayi asal degildir");
        }
    }
}
