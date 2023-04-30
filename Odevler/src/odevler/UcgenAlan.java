package odevler;

import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double kenar1, kenar2,hipotenus,cevre,alan,u;
        

        System.out.print("1.kenarı giriniz:");
        kenar1 = scan.nextDouble();

        System.out.print("2.kenarı giriniz:");
        kenar2 = scan.nextDouble();

              
        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        u = (kenar1+kenar2+hipotenus)/2;
        cevre=2*u;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));
        
        System.out.println("Hipotenüs:"+hipotenus);
        System.out.println("Çevre:"+cevre);
        System.out.println("Alan:"+alan);

        
    }
}
