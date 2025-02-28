package tr.com.mcay.behavioral.state;

/**
 * NormalHesap sınıfı - State (Durum) tasarım deseninin concrete state (somut durum) sınıfı
 * Normal hesap durumundaki davranışları uygular
 */
public class NormalHesap implements IHesapDurumu {

    /**
     * Normal hesap durumunda para çekme işlemi
     * Standart koşullar ve limitler uygulanır
     */
    @Override
    public void paraCek() {
        System.out.println("Normal hesaptan para çekiliyor. Standart işlem ücreti alınır ve limit sınırlıdır.");
    }

    /**
     * Normal hesap durumunda faiz ödeme işlemi
     * Standart faiz oranı uygulanır
     */
    @Override
    public void faizOde() {
        System.out.println("Normal hesaba standart faiz ödeniyor (%2).");
    }
} 