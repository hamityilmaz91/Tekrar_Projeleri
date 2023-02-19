package AracPrimHesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {


        start();
    }

    private static void start() {

        Scanner input = new Scanner(System.in);
        boolean isFail;//hesaplamanin durumunu kontrol etmek icin bir flag kullanalim.

        //hatali giriste veya yeni islem icin menu tekrar göyterilsin istiyorum.

        do {

            System.out.println("......Zorunlu Sigorta Primi Hesaplaplama ");
            System.out.println("Tarife donemi seciniz: ");
            System.out.println("1.Haziran 2022");
            System.out.println("2.Aralik  2022");
            //exeception handle etme
            int term = 0;
            try {
                term = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("gecersiz giris yaptiniz. Lutfen sayi giriniz");
            }
            input.nextLine();
            //girilen donem gecerli mi?
            if (term == 1 || term == 2) {
                Arac arac = new Arac();
                String termName= term==1 ?"Haziran 2022":"Aralik 2022";
                System.out.println("arac tipini giriniz");
                String type = input.next();
                arac.type = type;
                arac.countPrim(term);


                System.out.println("Hesaplama islemi basari ile tamamlandi");
                // sonucu yazdir
                System.out.println("Arac tipi : " + arac.type);
                System.out.println("Tarife donemi : " +termName);
                System.out.println("Aracinizin ilgili donem sigorta Primi : "+arac.prim);
                System.out.println("yeni islem icin 1 cikis icin herhangibir sayi  giriniz");
                int choice = input.nextInt();
                if(choice==1){
                    isFail=true;
                } else  {
                    isFail=false;

                }
                isFail = false;
            } else {
                System.out.println("hatali sayi girisi!!!");
                isFail = true;
            }

        } while (isFail);//for secmememizin nedeni kac defa yapacak oldugumuzu bilmiyor olmamiz.Bu durumda
        //2 secenek var . While veya do while
        System.out.println("iyi gunler dileriz");

    }

}
