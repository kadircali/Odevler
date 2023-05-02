package odevler;

import java.util.Scanner;

public class UsHesap2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban, us;

        System.out.print("Taban değerini giriniz: ");
        taban = scan.nextInt();

        System.out.print("Üs değerini giriniz: ");
        us = scan.nextInt();

        int sonuc = usAl(taban, us);

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }

    static int usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us % 2 == 0) {
            int altUs = usAl(taban, us / 2);
            return altUs * altUs;
        } else {
            int altUs = usAl(taban, (us - 1) / 2);
            return taban * altUs * altUs;
        }
    }
}
