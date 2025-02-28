package tr.com.mcay.behavioral.state;

/**
 * Hesap sınıfı - State (Durum) tasarım deseninin context (bağlam) sınıfı
 * Farklı hesap durumlarını kullanarak işlemleri gerçekleştirir
 */
public class Hesap {
    
    /**
     * Hesabın mevcut durumu
     * Bu referans üzerinden durum davranışları çağrılır
     */
    private IHesapDurumu hesapDurumu;
    
    /**
     * Hesap oluşturulduğunda varsayılan olarak normal hesap durumunda başlar
     */
    public Hesap() {
        // Başlangıçta normal hesap durumunda
        this.hesapDurumu = new NormalHesap();
        System.out.println("Yeni hesap oluşturuldu. Varsayılan durum: Normal Hesap");
    }
    
    /**
     * Para çekme işlemini mevcut hesap durumuna devreder
     */
    public void paraCek() {
        // İşlemi mevcut duruma devreder
        hesapDurumu.paraCek();
    }
    
    /**
     * Faiz ödeme işlemini mevcut hesap durumuna devreder
     */
    public void faizOde() {
        // İşlemi mevcut duruma devreder
        hesapDurumu.faizOde();
    }
    
    /**
     * Hesabın durumunu değiştirir
     * 
     * @param yeniHesapDurumu Hesabın yeni durumu
     */
    public void durumDegistir(IHesapDurumu yeniHesapDurumu) {
        this.hesapDurumu = yeniHesapDurumu;
        System.out.println("Hesap durumu değiştirildi: " + yeniHesapDurumu.getClass().getSimpleName());
    }
} 