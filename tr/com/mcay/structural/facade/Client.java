package tr.com.mcay.structural.facade;

/**
 * Client sınıfı, KrediFacade sınıfını kullanarak kredi işlemlerini gerçekleştirir.
 */
public class Client {
    
    public static void main(String[] args) {
        System.out.println("Facade Tasarım Deseni Örneği - Kredi Sistemi");
        System.out.println("--------------------------------------------");
        
        // KrediFacade nesnesi oluştur
        KrediFacade krediFacade = new KrediFacade();
        
        // Örnek müşteri numarası
        String musteriNo = "12345678901";
        
        System.out.println("\nMüşteri No: " + musteriNo + " için kredi kullanılabilirlik kontrolü:");
        
        // Kredi kullanılabilirlik kontrolü
        boolean krediKullanilabilir = krediFacade.krediKullanilabilirMi(musteriNo);
        
        System.out.println("\nSonuç: " + (krediKullanilabilir ? 
                "Müşteri kredi kullanabilir." : 
                "Müşteri kredi kullanamaz."));
    }
} 