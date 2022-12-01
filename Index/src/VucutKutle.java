import java.util.Scanner;

public class VucutKutle {
    public static void main(String[] args) {
        double kilo,boy,index;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu girin:");
        boy = input.nextDouble();
        System.out.print("Kilonuzu girin:");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);

        System.out.print("Vucut kütle indexiniz : " + index);

    }
}
