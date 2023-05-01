package odevler;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlıcanFiyat = 5.00;
        double armutNet, elmaNet, domatesNet, muzNet, patlıcanNet,toplam;

        System.out.print("Armut Kaç Kilo? :");
        armutNet = scan.nextByte() * armutFiyat;

        System.out.print("Elma Kaç Kilo? :");
        elmaNet = scan.nextByte() * elmaFiyat;

        System.out.print("DomatesKaç Kilo? :");
        domatesNet = scan.nextByte() * domatesFiyat;

        System.out.print("Muz Kilo? :");
        muzNet = scan.nextByte() * muzFiyat;

        System.out.print("Patlıcan Kaç Kilo? :");
        patlıcanNet = scan.nextByte() * patlıcanFiyat;

        toplam = armutNet+elmaNet+domatesNet+muzNet+patlıcanNet;
        System.out.println("Toplam Tutar: "+toplam);
    }
}
