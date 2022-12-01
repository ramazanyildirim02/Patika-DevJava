import java.util.Scanner;

public class DaireAlaniveCevresi {
    public static void main(String[] args) {
        int yaricap;
        double  pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı girin:");
        yaricap = input.nextInt();

        double cevre = 2 * pi * yaricap;
        double alan = pi * yaricap * yaricap;

        System.out.println("Çevreniz :" + cevre);
        System.out.println("Alanınız: " + alan);


    }

}
