
package odevler;


import java.util.Arrays;
import java.util.Scanner;


public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[] =  {15,12,788,1,-1,-778,2,0};
        System.out.print("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int enKucuk=0,enBuyuk=0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<sayi)
            {
                enKucuk = numbers[i];
            }
            if(sayi<numbers[i]){
                enBuyuk= numbers[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı"+enKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı "+enBuyuk);
        
        
        
      
    }
}
