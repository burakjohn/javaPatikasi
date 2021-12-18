package Giris;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args){
       double Armut= 2.14;
       double Elma=3.67;
       double Domates= 1.11;
       double Muz= 0.95;
       double Patlican =5.00;
        double ArmutK,ElmaK, DomatesK, MuzK, PatlicanK, toplam;
       Scanner meyve = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        ArmutK = meyve.nextDouble();

        System.out.print("Elma Kaç Kilo ? ");
        ElmaK = meyve.nextDouble();

        System.out.print("Domates Kaç Kilo ? ");
        DomatesK = meyve.nextDouble();

        System.out.print("Muz Kaç Kilo ? ");
        MuzK = meyve.nextDouble();

        System.out.print("Patlican Kaç Kilo ? ");
        PatlicanK = meyve.nextDouble();

        toplam = (Armut*ArmutK)+(ElmaK*Elma)+(DomatesK*Domates)+(MuzK*Muz)+(PatlicanK*Patlican);
        System.out.println("toplam tutar: "+toplam);
    }
}
