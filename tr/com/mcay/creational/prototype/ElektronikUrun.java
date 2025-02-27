package tr.com.mcay.creational.prototype;

public class ElektronikUrun implements Clonable {
    private int urunKodu;
    private String urunAdi;
    private double satisFiyati;

    public ElektronikUrun(int urunKodu, String urunAdi, double satisFiyati) {
        this.urunKodu = urunKodu;
        this.urunAdi = urunAdi;
        this.satisFiyati = satisFiyati;
    }

    @Override
    public Clonable clone() {
        return new ElektronikUrun(this.urunKodu, this.urunAdi, this.satisFiyati);
    }

    // Getter ve Setter metodları
    public int getUrunKodu() {
        return urunKodu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }
}