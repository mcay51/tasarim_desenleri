package tr.com.mcay.behavioral.state;

/**
 * AltinHesap sınıfı - State (Durum) tasarım deseninin concrete state (somut durum) sınıfı
 * Altın hesap durumundaki davranışları uygular
 */
public class AltinHesap implements IHesapDurumu {

    /**
     * Altın hesap durumunda para çekme işlemi
     * Altın hesap sahipleri için özel ayrıcalıklar içerir
     */
    @Override
    public void paraCek() {
        System.out.println("Altın hesaptan para çekiliyor. Ek ücret alınmaz ve limit daha yüksektir.");
    }

    /**
     * Altın hesap durumunda faiz ödeme işlemi
     * Altın hesap sahipleri için daha yüksek faiz oranı uygulanır
     */
    @Override
    public void faizOde() {
        System.out.println("Altın hesaba yüksek oranlı faiz ödeniyor (%5).");
    }
} 