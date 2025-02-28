package tr.com.mcay.behavioral.mediator;

/**
 * Somut Katılımcı sınıfı
 * Katılımcı soyut sınıfını uygular
 */
public class Kullanici extends Katilimci {
    
    /**
     * Kullanici sınıfının yapıcı metodu
     * 
     * @param ad Kullanıcının adı
     * @param mediator Kullanıcının kullanacağı mediator
     */
    public Kullanici(String ad, Mediator mediator) {
        super(ad, mediator);
    }
    
    /**
     * Kullanıcı mesaj gönderme işlemini gerçekleştirir
     * 
     * @param mesaj Gönderilecek mesaj
     */
    @Override
    public void mesajGonder(String mesaj) {
        System.out.println(ad + " mesaj gönderdi: " + mesaj);
        super.mesajGonder(mesaj);
    }
    
    /**
     * Kullanıcı mesaj alma işlemini gerçekleştirir
     * 
     * @param mesaj Alınan mesaj
     */
    @Override
    public void mesajAl(String mesaj) {
        System.out.println(ad + " mesaj aldı: " + mesaj);
    }
} 