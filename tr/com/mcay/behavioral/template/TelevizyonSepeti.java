package tr.com.mcay.behavioral.template;

/**
 * TelevizyonSepeti sınıfı, AlisverisSepeti soyut sınıfını genişleten somut bir sınıftır.
 * Bu sınıf, televizyon alışverişine özgü davranışları uygular.
 */
public class TelevizyonSepeti extends AlisverisSepeti {
    
    /**
     * Televizyon seçme işlemini gerçekleştirir.
     * Bu metot, AlisverisSepeti sınıfındaki soyut urunSec() metodunu uygular.
     */
    @Override
    public void urunSec() {
        System.out.println("Televizyon modelleri listeleniyor...");
        System.out.println("Televizyon seçildi: 55 inç Smart LED TV");
    }
    
    /**
     * Televizyon için ödeme işlemini gerçekleştirir.
     * Bu metot, AlisverisSepeti sınıfındaki soyut odemeYap() metodunu uygular.
     */
    @Override
    public void odemeYap() {
        System.out.println("Televizyon için ödeme yapılıyor: 15.000 TL");
        System.out.println("Ödeme işlemi başarıyla tamamlandı.");
    }
} 