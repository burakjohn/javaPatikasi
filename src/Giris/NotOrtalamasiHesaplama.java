package Giris;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+ fizik+ kimya+ turkce+ tarih+ muzik);
        double ortalama = toplam/6;
        System.out.println("ortalamanız: "+ortalama);

        String str = ortalama >= 60 ?  "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}