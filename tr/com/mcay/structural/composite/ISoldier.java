package tr.com.mcay.structural.composite;

/**
 * Component arayüzü - Hem yaprak hem de kompozit nesneler için ortak davranışı tanımlar
 */
public interface ISoldier {
    /**
     * Askere verilen emri yerine getirir
     */
    void executeOrder();
    
    /**
     * Askerin adını döndürür
     * @return askerin adı
     */
    String getName();
    
    /**
     * Askerin rütbesini döndürür
     * @return askerin rütbesi
     */
    String getRank();
} 