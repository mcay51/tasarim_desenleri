package tr.com.mcay.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Somut Mediator sınıfı
 * Katılımcılar arasındaki iletişimi yönetir
 */
public class SohbetOdasi implements Mediator {
    
    /**
     * Sohbet odasındaki katılımcıların listesi
     */
    private List<Katilimci> katilimcilar;
    
    /**
     * SohbetOdasi sınıfının yapıcı metodu
     */
    public SohbetOdasi() {
        this.katilimcilar = new ArrayList<>();
    }
    
    /**
     * Sohbet odasına yeni bir katılımcı ekler
     * 
     * @param katilimci Eklenecek katılımcı
     */
    public void katilimciEkle(Katilimci katilimci) {
        katilimcilar.add(katilimci);
    }
    
    /**
     * Bir katılımcıdan gelen mesajı diğer tüm katılımcılara iletir
     * 
     * @param gonderen Mesajı gönderen katılımcı
     * @param mesaj Gönderilen mesaj
     */
    @Override
    public void mesajGonder(Katilimci gonderen, String mesaj) {
        for (Katilimci katilimci : katilimcilar) {
            // Mesajı gönderen hariç diğer tüm katılımcılara mesajı ilet
            if (katilimci != gonderen) {
                katilimci.mesajAl(gonderen.getAd() + ": " + mesaj);
            }
        }
    }
} 