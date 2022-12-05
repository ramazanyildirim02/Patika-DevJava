import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int totaln = 1, n, r, totalr = 1, totalnm = 1, combination;
        int i = 1, j = 1, k = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n değeri girin:");
        n = input.nextInt();
        while (i <= n) {
            totaln *= i;
            i++;
        }

        System.out.print("r değeri girin:");
        r = input.nextInt();
        while (j <= r) {
            totalr *= j;
            j++;
        }

        while (k <= (n - r)) {
            totalnm *= k;
            k++;
        }

        combination = totaln / (totalr * totalnm);
        System.out.println("Kombinasyon sonucu: " + combination);


    }

}
