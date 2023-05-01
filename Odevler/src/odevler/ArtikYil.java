
package odevler;

import java.util.Scanner;


public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir yil giriniz: ");
        int yil = input.nextInt();

        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            System.out.println(yil + " bir artik yildir.");
        } else {
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}
