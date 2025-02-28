package tr.com.mcay.behavioral.state;

/**
 * Main sınıfı - State (Durum) tasarım deseninin kullanımını gösteren örnek
 */
public class Main {
    
    public static void main(String[] args) {
        // Yeni bir hesap oluştur (varsayılan olarak NormalHesap durumunda)
        Hesap hesap = new Hesap();
        
        // Normal hesap durumunda işlemler
        System.out.println("\n--- Normal Hesap Durumunda İşlemler ---");
        hesap.paraCek();
        hesap.faizOde();
        
        // Hesap durumunu Altın Hesap'a değiştir
        System.out.println("\n--- Hesap Durumu Değiştiriliyor ---");
        hesap.durumDegistir(new AltinHesap());
        
        // Altın hesap durumunda işlemler
        System.out.println("\n--- Altın Hesap Durumunda İşlemler ---");
        hesap.paraCek();
        hesap.faizOde();
        
        // Tekrar Normal Hesap'a dönüş
        System.out.println("\n--- Hesap Durumu Tekrar Değiştiriliyor ---");
        hesap.durumDegistir(new NormalHesap());
        
        // Normal hesap durumunda işlemler
        System.out.println("\n--- Normal Hesap Durumunda İşlemler ---");
        hesap.paraCek();
        hesap.faizOde();
    }
} 