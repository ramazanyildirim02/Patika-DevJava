public class Palindrom {
    static boolean isPalindrom(int deger){
        int temp = deger, sonBasamak, yeniSayi = 0;

        while (temp > 0 ){
            sonBasamak = temp % 10;
            yeniSayi = (yeniSayi * 10) + sonBasamak;
            temp /= 10;
        }
        if ( deger == yeniSayi){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
       System.out.print(isPalindrom(31));;

    }
}
