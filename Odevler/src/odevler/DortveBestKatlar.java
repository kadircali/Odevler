package odevler;

import java.util.Scanner;

public class DortveBestKatlar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (Math.pow(4, i) < sayi) {
                System.out.println("4 üzeri " + i + "=" + Math.pow(4, i));

            }
            if (Math.pow(5, i) < sayi) {
                System.out.println("5 üzeri " + i + "=" + Math.pow(5, i));
            }

        }
    }
}
