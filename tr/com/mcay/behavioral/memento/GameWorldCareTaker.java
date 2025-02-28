package tr.com.mcay.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * GameWorldCareTaker sınıfı, oyun dünyasının farklı durumlarını saklar.
 * Bu sınıf, Memento tasarım desenindeki Caretaker rolünü üstlenir.
 */
public class GameWorldCareTaker {
    // Kaydedilen durumların listesi
    private final List<GameWorldMemento> mementos = new ArrayList<>();

    /**
     * Yeni bir durumu listeye ekler.
     * 
     * @param memento Eklenecek GameWorldMemento nesnesi
     */
    public void addMemento(GameWorldMemento memento) {
        mementos.add(memento);
        System.out.println("Durum kaydedildi. Kayıt sayısı: " + mementos.size());
    }

    /**
     * Belirtilen indeksteki durumu döndürür.
     * 
     * @param index İstenen durumun indeksi
     * @return İstenen indeksteki GameWorldMemento nesnesi
     */
    public GameWorldMemento getMemento(int index) {
        if (index >= 0 && index < mementos.size()) {
            System.out.println("Durum geri yükleniyor. İndeks: " + index);
            return mementos.get(index);
        } else {
            System.out.println("Geçersiz indeks: " + index);
            return null;
        }
    }
    
    /**
     * Kaydedilen durum sayısını döndürür.
     * 
     * @return Kaydedilen durum sayısı
     */
    public int getMementoCount() {
        return mementos.size();
    }
} 