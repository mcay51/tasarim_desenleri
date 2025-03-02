package tr.com.mcay.behavioral.template;

/**
 * AlisverisSepeti sınıfı, Template Method tasarım deseninin temel sınıfıdır.
 * Bu sınıf, alışveriş işleminin genel akışını tanımlar ve alt sınıfların
 * belirli adımları özelleştirmesine izin verir.
 */
public abstract class AlisverisSepeti {
    
    /**
     * Template metodu: Alışveriş işleminin genel akışını tanımlar.
     * Bu metot final olarak işaretlenmiştir, böylece alt sınıflar tarafından değiştirilemez.
     */
    public final void alisverisYap() {
        baslangic();
        urunSec();
        odemeYap();
        bitis();
    }
    
    /**
     * Alışveriş işleminin başlangıç adımı.
     * Bu metot, tüm alt sınıflar için ortak davranışı tanımlar.
     */
    public void baslangic() {
        System.out.println("Alışveriş işlemi başlatılıyor...");
    }
    
    /**
     * Ürün seçme adımı.
     * Bu metot, alt sınıflar tarafından uygulanmalıdır.
     */
    public abstract void urunSec();
    
    /**
     * Ödeme yapma adımı.
     * Bu metot, alt sınıflar tarafından uygulanmalıdır.
     */
    public abstract void odemeYap();
    
    /**
     * Alışveriş işleminin bitiş adımı.
     * Bu metot, tüm alt sınıflar için ortak davranışı tanımlar.
     */
    public void bitis() {
        System.out.println("Alışveriş işlemi tamamlandı. İyi günlerde kullanın!");
    }
} 