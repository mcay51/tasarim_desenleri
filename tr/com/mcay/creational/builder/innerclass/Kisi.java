package tr.com.mcay.creational.builder.innerclass;

public class Kisi {
    // Tüm alanlar final olarak tanımlanır (immutability)
    private final String ad;
    private final String soyad;
    private final int yas;
    private final String adres;
    private final String telefon;
    
    // Private constructor - sadece Builder üzerinden erişilebilir
    private Kisi(Builder builder) {
        this.ad = builder.ad;
        this.soyad = builder.soyad;
        this.yas = builder.yas;
        this.adres = builder.adres;
        this.telefon = builder.telefon;
    }
    
    // Getter metotları (setter yok - immutable)
    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public int getYas() { return yas; }
    public String getAdres() { return adres; }
    public String getTelefon() { return telefon; }
    
    @Override
    public String toString() {
        return "Kisi [ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + 
               ", adres=" + adres + ", telefon=" + telefon + "]";
    }
    
    // Static inner class Builder
    public static class Builder {
        // Builder içindeki alanlar
        private String ad;
        private String soyad;
        private int yas;
        private String adres;
        private String telefon;
        
        // Builder constructor - boş constructor
        public Builder() {
            // Boş constructor - tüm alanlar opsiyonel
        }
        
        // Alternatif constructor - zorunlu alanlar için
        public Builder(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
        }
        
        // Builder metotları - fluent API
        public Builder ad(String ad) {
            this.ad = ad;
            return this;
        }
        
        public Builder soyad(String soyad) {
            this.soyad = soyad;
            return this;
        }
        
        public Builder yas(int yas) {
            this.yas = yas;
            return this;
        }
        
        public Builder adres(String adres) {
            this.adres = adres;
            return this;
        }
        
        public Builder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }
        
        // Build metodu - Kişi nesnesini oluşturur
        public Kisi build() {
            // Burada validasyon yapılabilir
            if (ad == null || soyad == null) {
                throw new IllegalStateException("Ad ve soyad zorunludur!");
            }
            return new Kisi(this);
        }
    }
} 