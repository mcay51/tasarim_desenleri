package tr.com.mcay.behavioral.template;

/**
 * TemplatePatternDemo sınıfı, Template Method tasarım deseninin nasıl çalıştığını
 * gösteren bir demo sınıfıdır.
 */
public class TemplatePatternDemo {
    
    /**
     * Ana metot, farklı alışveriş sepeti türlerini oluşturur ve
     * alışveriş işlemini gerçekleştirir.
     * 
     * @param args Komut satırı argümanları
     */
    public static void main(String[] args) {
        System.out.println("Template Method Tasarım Deseni Demo\n");
        
        // Televizyon sepeti oluştur ve alışveriş yap
        System.out.println("--- Televizyon Alışverişi ---");
        AlisverisSepeti tvSepeti = new TelevizyonSepeti();
        tvSepeti.alisverisYap();
        
        System.out.println("\n");
        
        // Buzdolabı sepeti oluştur ve alışveriş yap
        System.out.println("--- Buzdolabı Alışverişi ---");
        AlisverisSepeti buzdolabiSepeti = new BuzdolabiSepeti();
        buzdolabiSepeti.alisverisYap();
    }
} 