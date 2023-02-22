package LoginpageApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Siteye_uye_olma {
    //uye olma (register ):   Kullanicidan ad soyad ,kullanici adi ,e mail ve sifre bilgileri aliniz.
    //                        kullanici adi ve e mail ve sifre birer listede tutulur .
    //                        ayni kullanici adi veya email kabul edilmez.


    public static ArrayList<User> userlist = new ArrayList<>();


    //    public static void main(String[] args) {
//        siteye_uye_olma();
//    }
    public static void siteye_uye_olma() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sitemize üye olmak icin : ");
        System.out.println("Adinizi giriniz ");
        String isim = input.next();
        System.out.println("Soyadinizi giriniz ");
        String soyisim = input.next();
        System.out.println("Lutfen bir kullanici adi giriniz");
        String kullanici_adi = input.next();
        /////////////////////////////////////////////////////////////

        String email = Email_kontrol.emailkontrol();
        ///////////////////////////////////////////////////


        String sifre = Sifre_kontrol.sifrekontrol();

        System.out.println("asdasdasdasdasdasdasd");

        int counter = 0;
        for (User w : userlist) {

            if (w.kullanici_adi.equals(kullanici_adi) || w.email.equals(email)) {
                counter++;
            }

        }
        if (counter != 0) {
            System.out.println(" bu kullanici adi  veya email adresi daha onceden kaydedilmistir");
        }else {


            User obj = new User(isim, soyisim, email, sifre, kullanici_adi);
            userlist.add(obj);
            System.out.println("sitemize basarili bir sekilde uye oldunuz");
            System.out.println("Ana menuye yonlendiriliyorsunuz ");
            KarsilamaMenusu.anamenu();
        }

    }// uye olma metodu
}//class parantezi
