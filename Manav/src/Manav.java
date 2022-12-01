import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlıcan;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL\n\n\n");

        System.out.print("Armut kaç kilo ?:");
        armut = input.nextInt();
        System.out.print("Elma kaç kilo ?:");
        elma = input.nextInt();
        System.out.print("Domates kaç kilo ?:");
        domates = input.nextInt();
        System.out.print("Muz kaç kilo ?:");
        muz = input.nextInt();
        System.out.print("Patlıcan kaç kilo ?:");
        patlıcan = input.nextInt();

        double toplam = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlıcan * 5.00;
        System.out.print("Toplam Tutar : " + toplam);

    }
}
