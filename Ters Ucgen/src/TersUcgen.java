import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int deger;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin:");
        deger = input.nextInt();

        for (int i = 0; i <= deger; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= (2 * deger - (2 * i + 1)); n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
