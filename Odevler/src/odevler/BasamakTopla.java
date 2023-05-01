
package odevler;

import java.util.Scanner;


public class BasamakTopla {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;

        while (sayi != 0) {
            int digit = sayi % 10;
            toplam += digit;
            sayi /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + toplam);
    }
}
