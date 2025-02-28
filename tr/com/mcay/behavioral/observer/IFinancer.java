package tr.com.mcay.behavioral.observer;

/**
 * Observer deseni için Observer arayüzü
 */
public interface IFinancer {
    /**
     * Subject'in durumu değiştiğinde çağrılan güncelleme metodu
     * @param stock Değişen hisse senedi
     */
    void update(Stock stock);
} 