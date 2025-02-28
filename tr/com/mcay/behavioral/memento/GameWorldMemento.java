package tr.com.mcay.behavioral.memento;

/**
 * GameWorldMemento sınıfı, GameWorld nesnesinin durumunu saklar.
 * Bu sınıf, Memento tasarım desenindeki Memento rolünü üstlenir.
 */
public class GameWorldMemento {
    // Oyun dünyasının durumunu saklar
    private final String state;

    /**
     * Memento oluşturulurken oyun dünyasının durumu kaydedilir.
     * 
     * @param state Kaydedilecek oyun dünyası durumu
     */
    public GameWorldMemento(String state) {
        this.state = state;
    }

    /**
     * Kaydedilen durumu döndürür.
     * 
     * @return Kaydedilmiş oyun dünyası durumu
     */
    public String getState() {
        return state;
    }
} 