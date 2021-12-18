package Giris;

import java.util.Scanner;

public class UcgendeAlanBulanProgram {
    public static void main(String[] args) {

        double alan;

        Scanner values = new Scanner(System.in);
        System.out.print("üçgenin ilk kenar uzunluğunu giriniz:  ");
        int a = values.nextInt();


        System.out.print("üçgenin ikinci kenar uzunluğunu giriniz:  ");
        int b = values.nextInt();

        System.out.print("üçgenin üçüncü kenar uzunluğunu giriniz:  ");
        int c = values.nextInt();

        int cevreninYarisi = (a+b+c)/2;

        alan = Math.sqrt(cevreninYarisi*(cevreninYarisi - a)*(cevreninYarisi - b)*(cevreninYarisi-c));
        System.out.println("üçgenin alanı: "+ alan);



    }
}
