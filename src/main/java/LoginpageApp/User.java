package LoginpageApp;

public class User {

    //siteye uye olacak kisiler burada olusturulacak. Buraya gerekli parametreler gonderilerek
    // olusturulablir

    public String isim;
    public String soyisim;
    public String email;
    public String sifre;
    public String kullanici_adi;



    public User(String isim, String soyisim, String email, String sifre,String kullanici_adi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.kullanici_adi=kullanici_adi;
    }
}
