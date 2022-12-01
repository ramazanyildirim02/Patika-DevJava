import java.util.Scanner;

public class DaireAlaniveCevresi {
    public static void main(String[] args) {
        int yaricap, alfa ;
        double  pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı girin:");
        yaricap = input.nextInt();
        alfa = input.nextInt();

        double cevre = 2 * pi * yaricap;
        double alan = pi * yaricap * yaricap;
        double daireDilimi = (pi * (yaricap * yaricap ) *  alfa ) / 360

        System.out.println("Çevreniz :" + cevre);
        System.out.println("Alanınız: " + alan);
        System.out.printn("Dilim alanınız : " daireDilimi);

    }

}
