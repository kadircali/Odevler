
package odevler;

import java.util.Scanner;


public class VucutIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.print("Boyunuzu Giriniz(m):");
        boy=scan.nextDouble();
        System.out.print("Kilonuzu Giriniz(kg):");
        kilo=scan.nextDouble();
        indeks= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+indeks);
    }
}
