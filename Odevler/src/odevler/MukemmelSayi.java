
package odevler;

import java.util.Scanner;


public class MukemmelSayi {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int sayi,bolenlerToplam=0;
       System.out.print("Bir Sayı Giriniz: ");
        sayi = scan.nextInt();
        
        for (int i = 1; i < sayi; i++) {
            
            if(sayi%i==0){
                bolenlerToplam +=i;
            }
        }
        
        System.out.println((bolenlerToplam == sayi) ? sayi+" Mükemmel Sayıdır":sayi+" Mükemmel Sayı Değildir");
    }
}
