import java.util.Scanner;

public class CinZoysagi {
    public static void main(String[] args) {
        int yil;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin:");
        yil = input.nextInt();

        switch (yil % 12){
            case 0:
               burc = "Maymun";
               break;
            case 1:
                burc = "horoz";
                break;
            case 2:
                burc = "köpek";
                break;
            case 3:
                burc = "domuz";
                break;
            case 4:
                burc = "fare";
                break;
            case 5:
                burc = "öküz";
                break;
            case 6:
                burc = "kaplan";
                break;
            case 7:
                burc = "tavşan";
                break;
            case 8:
                burc = "ejderha";
                break;
            case 9:
                burc = "yılan";
                break;
            case 10:
                burc = "at";
                break;
            case 11:
                burc = "koyun";
                break;
        }
        System.out.print("ÇİN ZOYDAĞI BURCUNUZ: " + burc);
    }
}
