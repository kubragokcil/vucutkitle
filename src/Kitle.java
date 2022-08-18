import java.util.Scanner;
public class Kitle {
    public static void main (String[] args) {
        double boy, kilo, index,giris;
        Scanner input= new Scanner(System.in);
        System.out.println("Boyunuzu giriniz:");
                boy=input.nextDouble();
        System.out.println("Kilonuzu giriniz:");
                kilo=input.nextDouble();
        index=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz " + index);


    }
}
