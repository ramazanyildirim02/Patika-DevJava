import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int mesafe2, yas, yTip;
        double total;
        Scanner input = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden girin:");
        mesafe2 = input.nextInt();
        System.out.print("Yaşınızı girin:");
        yas = input.nextInt();
        System.out.print("yolculuk tipinizi girin(1-Tek yön 2-Çift yön):");
        yTip = input.nextInt();
        if (yas > 0 && mesafe2 > 0 && (yTip ==1 || yTip ==2)) {
            if(yas < 12){
                total = (mesafe2 * 0.10) * 0.5;
            } else if (yas >=12 && yas < 24) {
                total = (mesafe2 * 0.10) * 0.9;
            } else if (yas > 65){
                total = (mesafe2 * 0.10) * 0.7;
            }else {
                total = (mesafe2 * 0.10);
            }
            switch (yTip){
                case 1:
                    total = mesafe2 * 0.10;
                    break;
                case 2:
                    total = (mesafe2 * 0.10) * 0.8;
            }

            System.out.print("TOPLAM BİLET TUTARI: " +total);

        }else {
            System.out.print("lütfen pozitif bir değer girin!!");
        }

    }
}
