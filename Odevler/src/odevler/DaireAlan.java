package odevler;

import java.util.Scanner;

public class DaireAlan {

    public static void main(String[] args) {
        double r, a, alan;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yarıçapı Girin:");
        r = scan.nextDouble();

        System.out.print("Daire Diliminin Açısını Giriniz:");
        a = scan.nextDouble();
        alan = (pi * (r * r) * a) / 360;
        System.out.println("Dairenin Diliminin Alanı: "+alan);
    }
}
