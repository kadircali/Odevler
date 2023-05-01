package odevler;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        double km, ucret, toplam, baslangic = 10, kmUcret = 2.20;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilen Kilometre?:");
        km = scan.nextDouble();

        ucret = km * kmUcret;
        toplam = ucret + baslangic;

        toplam = (toplam < 20) ? 20 : toplam;

        System.out.println("Ödenecek Tutar:" + toplam);

    }
}
