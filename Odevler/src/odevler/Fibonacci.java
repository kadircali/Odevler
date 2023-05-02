
package odevler;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        int adet,a=0,b=1,c;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Serinin Kaç Elemanı Yazılsın?:");
        adet=scan.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < adet-2; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
