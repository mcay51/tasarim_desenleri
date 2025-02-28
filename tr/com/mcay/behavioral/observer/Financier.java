package tr.com.mcay.behavioral.observer;

/**
 * Observer deseni için somut Observer uygulaması
 */
public class Financier implements IFinancer {
    private String name;

    /**
     * Financier için yapıcı metod
     * @param name Finansçının adı
     */
    public Financier(String name) {
        this.name = name;
    }

    /**
     * Finansçının adını döndürür
     * @return Finansçının adı
     */
    public String getName() {
        return name;
    }

    /**
     * Subject'in durumu değiştiğinde çağrılan güncelleme metodu
     * @param stock Değişen hisse senedi
     */
    @Override
    public void update(Stock stock) {
        System.out.println(name + " güncelleme aldı: " + stock.getName() + 
                           " hisse senedinin değeri şimdi " + stock.getLotValue());
    }
} 