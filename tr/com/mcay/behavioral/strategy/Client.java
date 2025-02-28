package tr.com.mcay.behavioral.strategy;

/**
 * Strateji tasarım desenini gösteren istemci sınıfı
 */
public class Client {
    
    /**
     * Strateji tasarım desenini gösteren ana metod
     * @param args Komut satırı argümanları
     */
    public static void main(String[] args) {
        // Serileştirici oluştur
        Serializer serializer = new Serializer();
        
        // Serileştirilecek örnek veri
        String testData = "Merhaba, Strateji Tasarım Deseni!";
        
        // XML serileştirme stratejisini kullan
        serializer.setStrategy(new XmlSerialize());
        String xmlSerialized = serializer.serialize(testData);
        System.out.println("XML Serileştirilmiş: " + xmlSerialized);
        System.out.println("XML Deserialize edilmiş: " + serializer.deserialize(xmlSerialized));
        
        System.out.println();
        
        // İkili (Binary) serileştirme stratejisine geç
        serializer.setStrategy(new BinarySerialize());
        String binarySerialized = serializer.serialize(testData);
        System.out.println("İkili Serileştirilmiş: " + binarySerialized);
        System.out.println("İkili Deserialize edilmiş: " + serializer.deserialize(binarySerialized));
        
        // Bu, çalışma zamanında algoritmanın (stratejinin) nasıl değiştirilebileceğini gösterir
        // algoritmanın kullanıldığı bağlamı (Serializer) değiştirmeden
    }
} 