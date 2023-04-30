
package odevler;

import java.util.Scanner;


public class KdvHesap {
    public static void main(String[] args) {
           double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tutar giriniz:");
        tutar = scan.nextDouble();

        //0 ve altını bilerek kontrol etmiyorum
        kdvOran = 0 < tutar && tutar < 1000 ? 0.18 : 0.08;
        System.out.println(kdvOran);

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Oranı:" + kdvOran);
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV'li tutar:" + kdvliTutar);
    }
}
