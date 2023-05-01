package odevler;

import java.util.Scanner;

public class UcakBilet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınız: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini girin (1-Tek Yön, 2-Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        double fiyat = mesafe * 0.10;

        if (mesafe <= 0 || yas <= 0 || yolculukTipi < 1 || yolculukTipi > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        if (yas < 12) {
            fiyat *= 0.5;
        } else if (yas >= 12 && yas <= 24) {
            fiyat *= 0.9;
        } else if (yas >= 65) {
            fiyat *= 0.7;
        }

        if (yolculukTipi == 2) {
            fiyat = 2 * (fiyat *= 0.8);
        }

        System.out.println("Toplam Tutar = " + fiyat);
    }
}
