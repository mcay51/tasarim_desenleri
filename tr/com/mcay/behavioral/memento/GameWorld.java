package tr.com.mcay.behavioral.memento;

/**
 * GameWorld sınıfı, oyun dünyasının durumunu temsil eder.
 * Bu sınıf, Memento tasarım desenindeki Originator rolünü üstlenir.
 */
public class GameWorld {
    // Oyun dünyasının mevcut durumu
    private String state;

    /**
     * Oyun dünyasının mevcut durumunu ayarlar.
     * 
     * @param state Ayarlanacak yeni durum
     */
    public void setState(String state) {
        this.state = state;
        System.out.println("Oyun dünyası durumu: " + state);
    }

    /**
     * Oyun dünyasının mevcut durumunu döndürür.
     * 
     * @return Mevcut durum
     */
    public String getState() {
        return state;
    }

    /**
     * Oyun dünyasının mevcut durumunu kaydeder ve bir Memento nesnesi olarak döndürür.
     * 
     * @return Mevcut durumu içeren bir GameWorldMemento nesnesi
     */
    public GameWorldMemento saveState() {
        System.out.println("Oyun durumu kaydediliyor: " + state);
        return new GameWorldMemento(state);
    }

    /**
     * Oyun dünyasının durumunu, verilen Memento nesnesindeki duruma geri yükler.
     * 
     * @param memento Geri yüklenecek durumu içeren GameWorldMemento nesnesi
     */
    public void restoreState(GameWorldMemento memento) {
        state = memento.getState();
        System.out.println("Oyun durumu geri yüklendi: " + state);
    }
} 