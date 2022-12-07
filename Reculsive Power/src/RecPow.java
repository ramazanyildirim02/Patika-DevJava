import java.util.Scanner;

public class RecPow {
    static int pow(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * pow(a,b - 1);
    }

    public static void main(String[] args) {
        int taban, us;
        Scanner input = new Scanner(System.in);
        System.out.print("TABAN:");
        taban = input.nextInt();
        System.out.print("ÜS:");
        us = input.nextInt();

        System.out.print("Cevap: " + pow(taban, us));
    }

}
