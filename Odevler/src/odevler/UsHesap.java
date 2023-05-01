
package odevler;

import java.util.Scanner;


public class UsHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban,us,sonuc=1;
        System.out.print("Taban değerini giriniz: ");
        taban=scan.nextInt();
        
         System.out.print("Üs değerini giriniz: ");
        us=scan.nextInt();
        
        for (int i = 0; i < us; i++) {
            sonuc *=taban;
        }
        System.out.println("Sonuç:"+sonuc);
    }
}
