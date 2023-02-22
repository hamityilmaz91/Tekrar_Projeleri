package LoginpageApp;

import java.util.Scanner;

public class KarsilamaMenusu {


    public static void main(String[] args) {
        anamenu();
    }
    // uye olma ,giris ve cikis  yapilmali
    public static void anamenu() {

        System.out.printf("%-12s  %-12s %-12s","-----------------------------","YENI DÜNYA SITESINE HOSGELDINIZ","-----------------------------");
        System.out.println();
        System.out.printf("%-12s","Sitemize üye olmak icin 1 e basiniz");
        System.out.println();
        System.out.printf("%-12s","Sitemize giris yapmak icin  2 ye basiniz");
        System.out.println();
        System.out.printf("%-12s","Sitemizden cikis yapmak icin  3 e basiniz  ");

        Scanner input = new Scanner(System.in);
        int secim=0;
        int counter=0;
        do {
            try {
                secim= input.nextInt();
            } catch (Exception e) {
                System.out.println("Harf giremezsiniz !!! ");
            }
            input.nextLine();
            switch (secim) {

                case 1:
                    Siteye_uye_olma.siteye_uye_olma();
                    counter++;
                    break;
                case 2:
                Siteye_login_olma.siteye_giris_yapma();
                    counter++;
                    break;
                case 3:
                    siteden_cikis();
                    counter++;

                    break;
                default:
                    System.out.println("Hatali giris !!!");
                    System.out.println("lutfen tekrar deneyin");
                    break;
            }


        }while (counter<1);











    }

    private static void siteden_cikis() {
    }







}
