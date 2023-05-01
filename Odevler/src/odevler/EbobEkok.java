package odevler;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok;
        int i = 1;
        System.out.print("1. sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2 = scan.nextInt();

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("Girilen sayıların EBOB değeri : " + ebob);
        System.out.println("Girilen sayıların EKOK değeri : " + ekok);
    }
}
