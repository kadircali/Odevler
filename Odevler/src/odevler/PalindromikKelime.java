
package odevler;

import java.util.Scanner;


public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String kelime = input.nextLine();

        String tersKelime = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }

        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println(kelime + " palindromiktir.");
        } else {
            System.out.println(kelime + " palindromik değildir.");
        }
    }
}
