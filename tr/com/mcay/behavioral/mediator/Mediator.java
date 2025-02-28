package tr.com.mcay.behavioral.mediator;

/**
 * Mediator arayüzü
 * Bu arayüz, katılımcılar arasındaki iletişimi yönetir
 */
public interface Mediator {
    
    /**
     * Bir katılımcıdan diğer katılımcılara mesaj gönderir
     * 
     * @param gonderen Mesajı gönderen katılımcı
     * @param mesaj Gönderilecek mesaj
     */
    void mesajGonder(Katilimci gonderen, String mesaj);
} 