package odevler;

import java.util.Arrays;

public class TekrarEdenSayilar {
    
    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 4, 6, 10, 1, 3, 4, 2, 10, 1, 32, 98, 74, 54, 6,32};
        int[] numbers2 = new int[numbers.length];
        int sayac = 0;
        for (int i = 0; i < numbers.length; i++) {
            
            for (int j = 0; j < numbers.length; j++) {
                
                if ((i != j) && (numbers[i] == numbers[j]) && (numbers[i] % 2 == 0)) {
                    numbers2[sayac++] = numbers[i];
                   break;
                }
            }
            
        }
        Arrays.sort(numbers2);
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
            
        }
    }
}
