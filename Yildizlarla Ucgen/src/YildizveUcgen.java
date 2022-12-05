import java.util.Scanner;

public class YildizveUcgen {
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç basamak?:");
        basamak = input.nextInt();

        for(int i = 1; i <= basamak; i++){
            for (int j = 1; j <= (basamak - i); j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = (basamak - 1); i >= 1; i--){
            for (int j = 1; j <= (basamak - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
