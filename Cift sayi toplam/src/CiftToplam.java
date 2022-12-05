import java.util.Scanner;

public class CiftToplam {
    public static void main(String[] args) {
        int value, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı girin:");
            value = input.nextInt();

            if (value % 4 == 0){
                total += value;
            }
        }while (value % 2 == 0);

        System.out.print("toplam = " + total);
    }
}
