package Giris;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double Tax=0.18, Tax2=0.08, TotalTax, WithoutTax, WithTax;


        Scanner inpt = new Scanner(System.in);

        System.out.print("para değerini giriniz: ");
         WithoutTax = inpt.nextDouble();
         System.out.println("KDV'siz ücret: "+ WithoutTax);

         TotalTax = WithoutTax <= 1000 ? WithoutTax*Tax : WithoutTax*Tax2;
        System.out.println("KDV ücreti: "+ TotalTax);

        WithTax = TotalTax + WithoutTax;
        System.out.println("KDV dahil ücreti: "+ WithTax);

    }
}
