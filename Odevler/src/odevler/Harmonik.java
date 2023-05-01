
package odevler;

import java.util.Scanner;


public class Harmonik {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        double harmonikSeri = 0.0;

        for (int i = 1; i <= sayi; i++) {
            harmonikSeri += (double) 1 / i;
        }

        System.out.println("Harmonik seri: " + harmonikSeri);
    }
}
