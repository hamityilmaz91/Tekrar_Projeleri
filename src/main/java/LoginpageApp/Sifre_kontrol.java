package LoginpageApp;

import java.util.Scanner;

public class Sifre_kontrol {
    //sifre validation :  bosluk icermemeli
//                    en az 6 karakter olmali
//                    en az bir tane kücük harf icermeli
//                    en az bir tane büyük harf icermeli
//                    en az bir tane rakam icermeli
//                    en az bir tane sembol icermeli
    public static String sifrekontrol() {

        System.out.println(" lutfen sifrenizi giriniz ");
        Scanner input = new Scanner(System.in);
        String sifre = input.next();

        boolean uzunluksarti = sifre.length() > 5;
        System.out.println("uzunluk sarti = " + uzunluksarti);

        boolean enazbirkucuk = sifre.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("en az bir kucuk harf sarti" + enazbirkucuk);

        boolean enazbirbuyukharfsarti = sifre.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("enazbirbuyukharfsarti = " + enazbirbuyukharfsarti);

        boolean enazbirrakam = sifre.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("enazbirrakam = " + enazbirrakam);

        boolean enazbirsembol = sifre.replaceAll("[^a-zA-Z0-9]", "").length() > 0;
        System.out.println("enazbirsembol = " + enazbirsembol);

        if (uzunluksarti && enazbirbuyukharfsarti && enazbirkucuk && enazbirrakam && enazbirsembol) {

            System.out.println("sifreniz basarili bir sekilde olusturulmustur.");

        } else {
            System.out.println("kural disi sifre girdiniz tekrar deneyin");
            sifrekontrol();
        }


        return sifre;
    }// metod parantezi
}//class parantezi
