
package odevler;

import java.util.Scanner;


public class Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        
        int enKucuk = Math.min(Math.min(sayi1, sayi2), sayi3);
        int enBuyuk = Math.max(Math.max(sayi1, sayi2), sayi3);
        int ortanca = (sayi1 + sayi2 + sayi3) - enKucuk - enBuyuk;

        
        String siralama = enKucuk + "<" + ortanca + "<" + enBuyuk;

        
        System.out.println("Sayıların sıralaması: " + siralama);
    }
}
