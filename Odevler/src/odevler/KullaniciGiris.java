package odevler;

import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "", password = "";
        String kullaniciAd, kullaniciSifre;
        boolean kontrol = true;

        while (kontrol) {
            System.out.print("Ne işlem Yapmak İstiyorsunuz 1-Giriş 2-Kaydol 3-Çıkış?:");
            int islem = scan.nextInt();
            if (islem == 1) {
                System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
                kullaniciAd = scan.next();

                System.out.print("Lütfen Şifrenizi Giriniz:");
                kullaniciSifre = scan.next();

                if (kullaniciAd.equals(userName) && kullaniciSifre.equals(password)) {
                    System.out.println("Giriş Başarılı");
                    kontrol = false;
                } else {

                    System.out.println("Giriş Başarısız! Şifrenizi Yenilemek İstiyorsanız 1'e Basınız,Çıkmak için 2'ye Basınız:");
                    int secim = scan.nextInt();

                    if (secim == 1) {
                        while (true) {

                            System.out.print("Yeni Şifrenizi Giriniz:");
                            String newPassword = scan.next();
                            if (newPassword.equals(password)) {
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            } else {
                                System.out.println("Şifre oluşturuldu");
                                password = newPassword;
                                break;
                            }
                        }//while bitiş

                    }

                }

            } else if (islem == 2) {

                System.out.print("Lütfen Kullanıcı Adı Belirleyiniz:");
                userName = scan.next();
                System.out.print("Lütfen Şifre Belirleyiniz:");
                password = scan.next();
            } else if (islem == 3) {
                kontrol = false;
            }
        }//dış while bitiş
        System.out.println("Program Sonlandı");
    }
}
