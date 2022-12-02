import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını girin:");
        username = input.nextLine();
        System.out.print("Şifrenizi girin:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.print("Girişiniz yapıldı !");
        } else {
            System.out.print("Kullanıcı adı veya parola yanlış. Tekrar deneyin ! ");
        }




    }
}
