
package odevler;


public class DiziFrekans {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 1, 2, 1, 4, 5, 3, 2, 3, 2, 1};
        
        int[] frekanslar = new int[dizi.length];
        int kontrol = -1;
        
        for(int i = 0; i < dizi.length; i++) {
            int sayac = 1;
            for(int j = i+1; j < dizi.length; j++) {
                if(dizi[i] == dizi[j]) {
                    sayac++;
                    frekanslar[j] = kontrol;
                }
            }
            if(frekanslar[i] != kontrol)
                frekanslar[i] = sayac;
        }
        
        System.out.println("Eleman | Frekans");
        for(int i = 0; i < frekanslar.length; i++) {
            if(frekanslar[i] != kontrol)
                System.out.println(dizi[i] + "\t | " + frekanslar[i]);
        }
    }
}
