package tr.com.mcay.behavioral.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Observer deseni için Subject sınıfı
 */
public class Stock {
    private String name;
    private BigDecimal lotValue;
    private List<IFinancer> financiers = new ArrayList<>();

    /**
     * Stock için yapıcı metod
     * @param name Hisse senedinin adı
     * @param lotValue Hisse senedinin başlangıç lot değeri
     */
    public Stock(String name, BigDecimal lotValue) {
        this.name = name;
        this.lotValue = lotValue;
    }

    /**
     * Hisse senedinin adını döndürür
     * @return Hisse senedinin adı
     */
    public String getName() {
        return name;
    }

    /**
     * Hisse senedinin lot değerini döndürür
     * @return Hisse senedinin lot değeri
     */
    public BigDecimal getLotValue() {
        return lotValue;
    }

    /**
     * Hisse senedinin lot değerini ayarlar ve gözlemcilere bildirir
     * @param lotValue Hisse senedinin yeni lot değeri
     */
    public void setLotValue(BigDecimal lotValue) {
        this.lotValue = lotValue;
        notifyFinanciers();
    }

    /**
     * Bir finansçıyı abone yapar
     * @param financier Abone olacak finansçı
     */
    public void subscribe(IFinancer financier) {
        financiers.add(financier);
    }

    /**
     * Bir finansçının aboneliğini iptal eder
     * @param financier Aboneliği iptal edilecek finansçı
     */
    public void unsubscribe(IFinancer financier) {
        financiers.remove(financier);
    }

    /**
     * Tüm abone finansçılara değişiklikleri bildirir
     */
    private void notifyFinanciers() {
        for (IFinancer financier : financiers) {
            financier.update(this);
        }
    }
} 