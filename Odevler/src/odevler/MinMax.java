package odevler;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.print("Kaç sayı gireceksiniz? ");
        int n = scan.nextInt();

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scan.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
