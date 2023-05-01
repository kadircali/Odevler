
package odevler;

import java.util.Scanner;


public class Zodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (gün/ay/yıl) formatında giriniz: ");
        String dt = input.nextLine();

        String[] parts = dt.split("/");
        int year = Integer.parseInt(parts[2]);

        String[] zodiacs = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        String zodiac = zodiacs[year % 12];

        System.out.println("Çin zodyağı burcunuz: " + zodiac);
    }
}
