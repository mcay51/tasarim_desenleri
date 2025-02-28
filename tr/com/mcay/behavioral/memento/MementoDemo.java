package tr.com.mcay.behavioral.memento;

/**
 * MementoDemo sınıfı, Memento tasarım deseninin nasıl kullanılacağını gösteren örnek bir uygulamadır.
 * Bu örnekte, bir oyun dünyasının farklı durumlarını kaydedip geri yükleme işlemleri gösterilmektedir.
 */
public class MementoDemo {
    
    public static void main(String[] args) {
        // Originator: Durumu kaydedilecek ve geri yüklenecek nesne
        GameWorld gameWorld = new GameWorld();
        
        // Caretaker: Durumları saklayan nesne
        GameWorldCareTaker careTaker = new GameWorldCareTaker();
        
        // Oyun dünyasının ilk durumunu ayarla
        gameWorld.setState("Level 1 - Başlangıç noktası");
        
        // İlk durumu kaydet
        careTaker.addMemento(gameWorld.saveState());
        
        // Oyun dünyasının durumunu değiştir
        gameWorld.setState("Level 2 - Orta nokta");
        
        // İkinci durumu kaydet
        careTaker.addMemento(gameWorld.saveState());
        
        // Oyun dünyasının durumunu tekrar değiştir
        gameWorld.setState("Level 3 - Boss savaşı öncesi");
        
        // Üçüncü durumu kaydet
        careTaker.addMemento(gameWorld.saveState());
        
        // Oyun dünyasının durumunu son kez değiştir
        gameWorld.setState("Level 3 - Final");
        
        System.out.println("\n--- Kaydedilen Durumlara Geri Dönüş ---\n");
        
        // İkinci duruma geri dön (Level 2)
        gameWorld.restoreState(careTaker.getMemento(1));
        
        // İlk duruma geri dön (Level 1)
        gameWorld.restoreState(careTaker.getMemento(0));
        
        // Son kaydedilen duruma geri dön (Level 3 - Boss savaşı öncesi)
        gameWorld.restoreState(careTaker.getMemento(2));
    }
} 