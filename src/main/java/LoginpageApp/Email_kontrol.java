package LoginpageApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Email_kontrol {

    public static String emailkontrol() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email=input.next();
        //email validation :  bosluk icermemeli
        //                    @ icermeli
        //                    gmail.com ,hotmail.com veya yahoo ile bitmeli
        //                    mailin kullanici adi kisminda (@ ' ten once ) sadece büyük kücük harf ,rakam yada -._ sembolleri olabilir

        boolean oncesi_son_durum=true;
        boolean bosluksarti= !email.contains(" ");
        System.out.println("bosluksarti = "+bosluksarti);

        boolean atsarti = email.contains("@");
        System.out.println("atsarti = "+atsarti);

        String arr[]= email.split("@");
        boolean sonkisim =arr[arr.length-1].equals("gmail.com")||arr[arr.length-1].equals("yahoo.com")||arr[arr.length-1].equals("hotmail.com");
        System.out.println("sonkisim = "+sonkisim);

        //@ ten dolayi farzedelim ki 4  parcali bir arraylar var elimizde.
        ArrayList<Boolean> oncesidogruluk= new ArrayList<>();

        for(int i =0; i<arr.length;i++){

           boolean oncesi= arr[i].replaceAll("[a-zA-Z0-9-_.]","").length()==0;
            System.out.println("oncesi = "+oncesi);
           oncesidogruluk.add(oncesi);
        }
        System.out.println(oncesidogruluk);
        if(oncesidogruluk.contains(false)){
             oncesi_son_durum=false;
            System.out.println("oncesi son durum = "+oncesi_son_durum);
        }

        if (oncesi_son_durum&&sonkisim&&atsarti&&bosluksarti){
            System.out.println(" girdiginiz mail onaylanmistir!!!! ");

        }else{
            System.out.println("gecersiz mail girdiniz tekrar kurallara uygun giriniz !!!!");
          emailkontrol();
        }


        return email;
    }//emailkontrol metod body
}//class body
