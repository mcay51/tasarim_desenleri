package tr.com.mcay.structural.composite;

/**
 * Composite tasarım desenini test eden ana sınıf
 */
public class Main {
    public static void main(String[] args) {
        // Tekil askerler (Leaf nesneleri) oluşturuluyor
        ISoldier er1 = new PrimitiveSoldier("Ahmet", "Er");
        ISoldier er2 = new PrimitiveSoldier("Mehmet", "Er");
        ISoldier er3 = new PrimitiveSoldier("Ali", "Er");
        ISoldier er4 = new PrimitiveSoldier("Veli", "Er");
        
        // Takım liderleri (Composite nesneleri) oluşturuluyor
        CompositeSoldier onbasi1 = new CompositeSoldier("Hasan", "Onbaşı");
        CompositeSoldier onbasi2 = new CompositeSoldier("Hüseyin", "Onbaşı");
        
        // Takım liderlerine askerler ekleniyor
        onbasi1.add(er1);
        onbasi1.add(er2);
        onbasi2.add(er3);
        onbasi2.add(er4);
        
        // Bölük komutanı oluşturuluyor
        CompositeSoldier yuzbasiKomutan = new CompositeSoldier("Kemal", "Yüzbaşı");
        
        // Bölük komutanına takım liderleri ekleniyor
        yuzbasiKomutan.add(onbasi1);
        yuzbasiKomutan.add(onbasi2);
        
        // Tabur komutanı oluşturuluyor
        CompositeSoldier binbasiKomutan = new CompositeSoldier("Osman", "Binbaşı");
        
        // Tabur komutanına bölük komutanı ekleniyor
        binbasiKomutan.add(yuzbasiKomutan);
        
        System.out.println("=== Tekil Asker Emri Uyguluyor ===");
        er1.executeOrder();
        
        System.out.println("\n=== Takım Lideri Emri Uyguluyor ===");
        onbasi1.executeOrder();
        
        System.out.println("\n=== Bölük Komutanı Emri Uyguluyor ===");
        yuzbasiKomutan.executeOrder();
        
        System.out.println("\n=== Tabur Komutanı Emri Uyguluyor ===");
        binbasiKomutan.executeOrder();
    }
} 