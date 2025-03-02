package tr.com.mcay.behavioral.template;

/**
 * BuzdolabiSepeti sınıfı, AlisverisSepeti soyut sınıfını genişleten somut bir sınıftır.
 * Bu sınıf, buzdolabı alışverişine özgü davranışları uygular.
 */
public class BuzdolabiSepeti extends AlisverisSepeti {
    
    /**
     * Buzdolabı seçme işlemini gerçekleştirir.
     * Bu metot, AlisverisSepeti sınıfındaki soyut urunSec() metodunu uygular.
     */
    @Override
    public void urunSec() {
        System.out.println("Buzdolabı modelleri listeleniyor...");
        System.out.println("Buzdolabı seçildi: No-Frost Çift Kapılı Buzdolabı");
    }
    
    /**
     * Buzdolabı için ödeme işlemini gerçekleştirir.
     * Bu metot, AlisverisSepeti sınıfındaki soyut odemeYap() metodunu uygular.
     */
    @Override
    public void odemeYap() {
        System.out.println("Buzdolabı için ödeme yapılıyor: 20.000 TL");
        System.out.println("Ödeme işlemi başarıyla tamamlandı.");
    }
} 