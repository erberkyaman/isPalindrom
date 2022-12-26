import java.util.Scanner;
public class Palindrom {
    static boolean isPalindrom(int x){
        int temp, reverse=0, last;
        temp=x;
        while(temp!=0){
            last=temp%10;
            reverse = (reverse*10) + last;
            temp/=10;
        }

        if (reverse==x){
            return true;
        }else {
            return false;}
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        n = input.nextInt();
        if(isPalindrom(n) == true){
            System.out.print("Girilen Sayı Palindrom!");
        }else {
            System.out.print("Girilen Sayı Palindrom Değil!");
        }
    }
}
