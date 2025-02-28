package tr.com.mcay.structural.proxy;

public class Ogrenci {
    private int id;
    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci(int id, String ad, String soyad, int yas) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
} 