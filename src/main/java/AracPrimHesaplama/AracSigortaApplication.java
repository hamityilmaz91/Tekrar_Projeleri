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

        do{

            System.out.println("......Zorunlu Sigorta Primi Hesaplaplama ");
            System.out.println("Tarife donemi seciniz: ");
            System.out.println("1.Haziran 2022");
            System.out.println("2.Aralik  2022");
            //exeception handle etme
            int term =0;
            try {
                term= input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("gecersiz giris yaptiniz. Lutfen sayi giriniz");
            }
            input.nextLine();
            //girilen donem gecerli mi?
            if(term==1 || term ==2 ){
                System.out.println("Hesaplama islemi basari ile tamamlandi");
                // sonucu yazdir
                isFail= false;
            }else{
                System.out.println("hatali sayi girisi!!!");
                isFail=true;
            }

        }while (isFail);//for secmememizin nedeni kac defa yapacak oldugumuzu bilmiyor olmamiz.Bu durumda
        //2 secenek var . While veya do while







    }

}
