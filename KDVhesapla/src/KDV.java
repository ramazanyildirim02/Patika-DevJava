import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double deger , kdv = 0.18,deger_ve_kdv;
        Scanner input = new Scanner(System.in);
        System.out.print("Br sayı girin : ");
        deger = input.nextDouble();

        deger_ve_kdv =  deger + (deger * kdv );
        System.out.println("KDV siz tutar:" + deger);
        System.out.println("KDV oranı:" + kdv);
        System.out.print("KDV li tutar : " + deger_ve_kdv);

    }

}
