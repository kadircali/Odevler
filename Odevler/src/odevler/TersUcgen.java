
package odevler;

import java.util.Scanner;


public class TersUcgen {
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int basamak = input.nextInt();

        // döngüler kullanarak ters üçgen çizme
       for(int i=0;i<basamak;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }   
             for (int j = 2*basamak-1; j >i*2; j--) {
               System.out.print("*");
           }
            
                System.out.println();   

        }
    }
    
}
