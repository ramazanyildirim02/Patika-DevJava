import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("ORTALAMA HESAPLAMA PROGRAMI");

        System.out.print("Matematik notunuzu girin:");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu girin:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu girin:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu girin:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu girin:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin:");
        muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih +muzik) / 6;
        String gecme = (ortalama >= 60.0) ? "Geçtiniz" : "Kaldınız" ;
        System.out.println("\nOrtalamanız:" + ortalama + "  " +  gecme);
    }
}