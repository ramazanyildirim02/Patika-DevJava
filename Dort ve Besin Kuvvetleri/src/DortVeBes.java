import java.util.Scanner;

public class DortVeBes {
    public static void main(String[] args) {
        int value, total = 1, total2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("sınır sayısı girin:");
        value = input.nextInt();


        System.out.print("4 ün kuvvetleri:\n");
        while (total <= value) {
            System.out.println(total);
            total *= 4;
        }

        System.out.print("5 in kuvvetleri:\n");
        while (total2 <= value) {
            System.out.println(total2);
            total2 *= 5;
        }

    }
}
