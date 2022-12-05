import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username, password;
        int bakiye = 3500, hak = 3, secim;
        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("kullanıcı adınız:");
            username = input.nextLine();
            System.out.print("şifreniz:");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Patika bankasına hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            System.out.print("Yatırmak istetiğiniz tutarı girin:");
                            int price = input.nextInt();
                            bakiye += price;
                            break;

                        case 2:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            System.out.print("Çekmek istediğiniz miktarı girin:");
                            price = input.nextInt();
                            if (price > bakiye) {
                                System.out.println("Hesabınızda yeterli para yok.");
                            } else {
                                bakiye -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                    }
                } while (secim != 4);
                System.out.println("TEKRAR GÖRÜŞMEK ÜZERE");
                break;
            } else {
                hak--;
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyin");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.");
                } else {
                    System.out.println("Kalan hakkınız: " + hak);
                }
            }

        }

    }
}
