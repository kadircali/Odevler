
package odevler;

import java.util.Scanner;


public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
    
    public static boolean isAsal(int sayi, int counter) {

        if (sayi <= 2) {
            return (sayi == 2) ? true : false;
        }
        if (sayi % counter == 0) {
            return false;
        }
        if (counter * counter > sayi) {
            return true;
        }

        return isAsal(sayi, counter + 1);
    }
}
