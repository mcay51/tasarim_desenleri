package tr.com.mcay.behavioral.state;

/**
 * IHesapDurumu arayüzü - State (Durum) tasarım deseninin durum arayüzü
 * Farklı hesap durumlarının uygulaması gereken davranışları tanımlar
 */
public interface IHesapDurumu {
    
    /**
     * Para çekme işlemini gerçekleştirir
     * Her hesap durumu için farklı davranış gösterebilir
     */
    void paraCek();
    
    /**
     * Faiz ödeme işlemini gerçekleştirir
     * Her hesap durumu için farklı davranış gösterebilir
     */
    void faizOde();
} 