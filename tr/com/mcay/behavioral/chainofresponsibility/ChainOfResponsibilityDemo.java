package tr.com.mcay.behavioral.chainofresponsibilty;

/**
 * Chain of Responsibility tasarım desenini gösteren demo sınıfı.
 * Bu sınıf, harcama onay zincirini oluşturur ve farklı tutarlardaki harcama isteklerini test eder.
 */
public class ChainOfResponsibilityDemo {
    
    public static void main(String[] args) {
        // Zincirdeki onaylayıcıları oluştur
        Calisan sorumlu = new Sorumlu();
        Calisan yonetici = new Yonetici();
        Calisan grupYoneticisi = new GrupYoneticisi();
        Calisan direktor = new Direktor();
        
        // Sorumluluk zincirini oluştur
        sorumlu.setNextApprover(yonetici);
        yonetici.setNextApprover(grupYoneticisi);
        grupYoneticisi.setNextApprover(direktor);
        
        // Farklı tutarlardaki harcama isteklerini test et
        System.out.println("--- 800 TL'lik harcama isteği ---");
        sorumlu.handleRequest(800);
        
        System.out.println("\n--- 4500 TL'lik harcama isteği ---");
        sorumlu.handleRequest(4500);
        
        System.out.println("\n--- 15000 TL'lik harcama isteği ---");
        sorumlu.handleRequest(15000);
        
        System.out.println("\n--- 70000 TL'lik harcama isteği ---");
        sorumlu.handleRequest(70000);
        
        System.out.println("\n--- 150000 TL'lik harcama isteği ---");
        sorumlu.handleRequest(150000);
    }
} 