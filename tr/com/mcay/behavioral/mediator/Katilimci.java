package tr.com.mcay.behavioral.mediator;

/**
 * Katılımcı soyut sınıfı
 * Tüm katılımcıların temel davranışlarını tanımlar
 */
public abstract class Katilimci {
    
    /**
     * Katılımcının adı
     */
    protected String ad;
    
    /**
     * Katılımcının iletişim kurduğu mediator
     */
    protected Mediator mediator;
    
    /**
     * Katılımcı sınıfının yapıcı metodu
     * 
     * @param ad Katılımcının adı
     * @param mediator Katılımcının kullanacağı mediator
     */
    public Katilimci(String ad, Mediator mediator) {
        this.ad = ad;
        this.mediator = mediator;
    }
    
    /**
     * Mediator aracılığıyla mesaj gönderir
     * 
     * @param mesaj Gönderilecek mesaj
     */
    public void mesajGonder(String mesaj) {
        mediator.mesajGonder(this, mesaj);
    }
    
    /**
     * Mesaj alma işlemini gerçekleştirir
     * Alt sınıflar tarafından uygulanmalıdır
     * 
     * @param mesaj Alınan mesaj
     */
    public abstract void mesajAl(String mesaj);
    
    /**
     * Katılımcının adını döndürür
     * 
     * @return Katılımcının adı
     */
    public String getAd() {
        return ad;
    }
} 