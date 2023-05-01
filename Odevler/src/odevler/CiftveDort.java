package odevler;

import java.util.Scanner;

public class CiftveDort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, toplam = 0;

        boolean kontrol = true;

        while (kontrol) {
            System.out.print("Sayi giriniz:");
            sayi = scan.nextInt();
            //soru açıklayıcı değil
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            } else if (sayi % 2 == 1) {
                kontrol = false;
            }
        }
        System.out.println("toplam:" + toplam);
    }
}
