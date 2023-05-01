package odevler;

import java.util.Scanner;

public class Zodyak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int birthYear = input.nextInt();

        int zodiacSign = birthYear % 12;

        String signName;

        switch (zodiacSign) {
            case 0:
                signName = "Maymun";
                break;
            case 1:
                signName = "Horoz";
                break;
            case 2:
                signName = "Köpek";
                break;
            case 3:
                signName = "Domuz";
                break;
            case 4:
                signName = "Fare";
                break;
            case 5:
                signName = "Öküz";
                break;
            case 6:
                signName = "Kaplan";
                break;
            case 7:
                signName = "Tavşan";
                break;
            case 8:
                signName = "Ejderha";
                break;
            case 9:
                signName = "Yılan";
                break;
            case 10:
                signName = "At";
                break;
            case 11:
                signName = "Koyun";
                break;
            default:
                signName = "Geçersiz";
                break;
        }

        System.out.println("Çin Zodyağı burcunuz: " + signName);
    }
}
