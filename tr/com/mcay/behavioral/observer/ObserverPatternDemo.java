package tr.com.mcay.behavioral.observer;

import java.math.BigDecimal;

/**
 * Observer desenini göstermek için demo sınıfı
 */
public class ObserverPatternDemo {
    
    public static void main(String[] args) {
        // Bir hisse senedi oluştur (Subject)
        Stock appleStock = new Stock("Apple", new BigDecimal("150.25"));
        
        // Finansçılar oluştur (Observers)
        Financier john = new Financier("John");
        Financier mary = new Financier("Mary");
        Financier robert = new Financier("Robert");
        
        // Finansçıları hisse senedine abone yap
        appleStock.subscribe(john);
        appleStock.subscribe(mary);
        appleStock.subscribe(robert);
        
        // Hisse senedi değerini değiştir, bu tüm finansçılara bildirilecek
        System.out.println("Hisse senedi değeri 155.75 olarak değiştiriliyor");
        appleStock.setLotValue(new BigDecimal("155.75"));
        
        // Bir finansçının aboneliğini iptal et
        System.out.println("\n" + mary.getName() + " aboneliği iptal ediliyor");
        appleStock.unsubscribe(mary);
        
        // Hisse senedi değerini tekrar değiştir
        System.out.println("\nHisse senedi değeri 160.50 olarak değiştiriliyor");
        appleStock.setLotValue(new BigDecimal("160.50"));
    }
} 