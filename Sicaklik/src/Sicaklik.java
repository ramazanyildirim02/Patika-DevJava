import java.util.Scanner;
public class Sicaklik {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);

            System.out.print("Hava sıcaklığını giriniz:");
            int heat=input.nextInt();

            if (-20<=heat && heat<5){
                System.out.print("Kayak yapabilirsiniz.");
            }
            else if(heat>=5 && heat<10){
                System.out.print("Sinemaya gidebilirsiniz.");
            }
            else if(heat>=10 && heat<=15){
                System.out.println("Sinemaya ya da pikniğe gitmeyi tercih edebilirsiniz.");
            }
            else if(heat>15 && heat<=25){
                System.out.print("Pikniğe gidebilirsiniz.");
            }
            else if(heat>25 && heat<=50){
                System.out.print("Yüzmeye gidebilirsiniz.");
            }
            else{
                System.out.print("Geçerli değer girin");
            }


        }
    }

