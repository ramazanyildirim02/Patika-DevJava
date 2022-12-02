import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        Matematik = input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        Fizik = input.nextInt();

        System.out.print("Türkçe notunuzu girin: ");
        Turkce = input.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        Kimya = input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        Muzik = input.nextInt();

        double ortalama = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5;

        if(ortalama >= 55){
            System.out.print("Geçtiniz ve ortalamanız: " + ortalama);
        }
        else
            System.out.print("KALDINIZ :(");



    }
}
