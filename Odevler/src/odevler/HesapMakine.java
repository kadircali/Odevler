package odevler;

import java.util.Scanner;

public class HesapMakine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1, s2, islem;
        System.out.print("İlk sayıyı giriniz:");
        s1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        s2 = scan.nextInt();
        System.out.println("1-toplama 2-çıkarma 3-çarpma 4-bölme");
        System.out.print("Yapmak istediğiniz işlem?:");
        islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam:" + (s1 + s2));
                break;
            case 2:
                System.out.println("Fark:" + (s1 - s2));
                break;
            case 3 : 
                System.out.println("Çarpım:"+(s1*s2));
                break;
            case 4 :
                System.out.println("Bölüm:"+(s1/s2));
                break;
            default:
                System.out.println("Yanlış işlem");
                break;
        }

    }
}
