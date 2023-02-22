package LoginpageApp;

import java.util.Scanner;

public class Siteye_login_olma {

    //giris(login):   kullanici adi  veya email ile birlikte sifre girilir .
    //                kullanici adi veya email bulunamazsa kayitli degil , üye olun uyarisi verilir
    //                kullanici adi veya email ile ayni indexte kayitli sifre dogrulanirsa siteye giris yapilir
    public static void siteye_giris_yapma(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Siteye giris yapmak icin lutfen kullanici veya email adresinizi girin");
        String emailveyakullaniciadi= input.next();
        int counter=0;
        for (User w:Siteye_uye_olma.userlist) {

            if(w.email.equals(emailveyakullaniciadi)||w.kullanici_adi.equals(emailveyakullaniciadi)){
                System.out.println("Kullanici adi veya email dogru bir sekilde girildi." +
                        "Simdi  Lutfen sifrenizi giriniz ");
                counter++;
            }


        }
        if(counter==0){
            System.out.println("Kullanici adi veya emaili yanlis girdiniz  veya kayitli degilsiniz lutfen tekrar deneyiniz");
            siteye_giris_yapma();
        }else{
            String sifre= input.next();

            

        }








    }

}
