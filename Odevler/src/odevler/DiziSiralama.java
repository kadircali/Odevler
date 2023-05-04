package odevler;

import java.util.Scanner;

public class DiziSiralama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleman;
        int[] numbers;
        System.out.print("Dizi kaç elemanlı olsun:");
        eleman = scan.nextInt();
        numbers = new int[eleman];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ".elemanı giriniz:");
            numbers[i] = scan.nextInt();

        }

        // 6  -1 5 6 -3  56
        /*
        int[] siraliDizi = new int[numbers.length];
        int enKucuk=numbers[0];
         */
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];//6
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
