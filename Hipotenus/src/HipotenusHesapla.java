import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("1.kenarı girin :");
        kenar1 = input.nextInt();
        System.out.print("2.kenarı girin: ");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("HİPOTENÜS = " + hipotenus);

    }
}
