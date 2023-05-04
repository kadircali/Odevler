
package odevler;


public class DiziHarmonik {
    public static void main(String[] args) {
        int numbers[] = {12,6,78,4,2,45,6,87,9,32};
        double seri=0,ortalama=0;
        
        for (int i = 0; i <numbers.length; i++) {
            
            seri += (10./numbers[i]);
        }
        ortalama = (numbers.length/seri);
        System.out.println(ortalama);
       
        
    }
}
