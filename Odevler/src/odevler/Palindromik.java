package odevler;

import java.util.Scanner;

public class Palindromik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (palindromikMi(sayi)) {
            System.out.println(sayi + " bir palindromik sayıdır.");
        } else {
            System.out.println(sayi + " bir palindromik sayı değildir.");
        }
    }

    public static boolean palindromikMi(int sayi) {

        int tersSayi = 0;
        int orijinalSayi = sayi;

        while (orijinalSayi != 0) {
            int kalan = orijinalSayi % 10;
            tersSayi = tersSayi * 10 + kalan;
            orijinalSayi /= 10;
        }

        if (sayi == tersSayi) {
            return true;
        } else {
            return false;
        }
    }
}
