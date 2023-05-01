package odevler;

import java.util.Scanner;

public class CiftSayi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi1;
        double toplam = 0, adet = 0;
        System.out.print("Bir sayı giriniz: ");
        sayi1 = scan.nextInt();

        //3'e 4'e ya da her ikisine birden bölünen tüm sayılar
        for (int i = 1; i <= sayi1; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                adet++;
            }

        }
        System.out.println("Ortalama:"+(toplam/adet));
    }
}
//  3 4  6  8 9 12 15  16 18 20
