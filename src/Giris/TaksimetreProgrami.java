package Giris;
import java.util.Scanner;


public class TaksimetreProgrami {
    public static void main(String[] args) {
        double Km,  Acilis = 10, toplam;

        Scanner Taxi = new Scanner(System.in);
        System.out.print("Gidilen kilometreyi girin: ");
        Km = Taxi.nextDouble();

        toplam = Acilis + (Km * 2.20);
        toplam = (toplam < 20 ) ? 20 : toplam;

        System.out.print( "tutar: " + toplam);





    }
}
