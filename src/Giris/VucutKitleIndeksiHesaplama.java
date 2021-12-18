package Giris;
import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        double boy, kilo, bmi;

        Scanner tart = new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz :");
        boy = tart.nextDouble();

        System.out.print("kilonuzu giriniz :");
        kilo = tart.nextDouble();

        bmi = kilo / (boy * boy);
        System.out.print("vücut kitle endeksiniz: "+ bmi);

    }
}
