
package odevler;


public class NotHesap {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = input.nextInt();

        int toplamNot = 0;
        int dersSayisi = 0;

        if (matematik >= 0 && matematik <= 100) {
            toplamNot += matematik;
            dersSayisi++;
        }

        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }

        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }

        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }

        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplamNot / dersSayisi;

            if (ortalama >= 55) {
                System.out.println("Ortalamanız: " + ortalama + " Geçtiniz!");
            } else {
                System.out.println("Ortalamanız: " + ortalama + " Kaldınız!");
            }
        } else {
            System.out.println("Hatalı not girişi yaptınız!");
        }

        
    
    }
}
