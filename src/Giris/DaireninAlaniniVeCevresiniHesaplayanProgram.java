package Giris;
import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args){
       int r, merkezAcisi;
       double alan, pi=3.14;


       Scanner daire =  new Scanner(System.in);
       System.out.print("daire diliminin açısını giriniz: ");
       merkezAcisi = daire.nextInt();

        System.out.print("yarıçapı giriniz: ");
        r = daire.nextInt();

        alan = pi * r * r * merkezAcisi/360;
        System.out.print("dairenin alanı: "+ alan);





    }
}
