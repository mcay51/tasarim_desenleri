package tr.com.mcay.behavioral.strategy;

/**
 * Serileştirme stratejisini kullanan bağlam (context) sınıfı
 */
public class Serializer {
    private ISerializable strategy;
    
    /**
     * Varsayılan yapıcı metod
     */
    public Serializer() {
        // Gerekirse varsayılan strateji burada ayarlanabilir
    }
    
    /**
     * Başlangıç stratejisi ile yapıcı metod
     * @param strategy Kullanılacak serileştirme stratejisi
     */
    public Serializer(ISerializable strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Serileştirme stratejisini ayarlar
     * @param strategy Kullanılacak serileştirme stratejisi
     */
    public void setStrategy(ISerializable strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Mevcut stratejiyi kullanarak veriyi serileştirir
     * @param data Serileştirilecek veri
     * @return Serileştirilmiş string
     */
    public String serialize(Object data) {
        if (strategy == null) {
            throw new IllegalStateException("Serileştirme stratejisi ayarlanmamış");
        }
        return strategy.serialize(data);
    }
    
    /**
     * Mevcut stratejiyi kullanarak veriyi deserialize eder
     * @param data Deserialize edilecek serileştirilmiş string
     * @return Deserialize edilmiş nesne
     */
    public Object deserialize(String data) {
        if (strategy == null) {
            throw new IllegalStateException("Serileştirme stratejisi ayarlanmamış");
        }
        return strategy.deserialize(data);
    }
} 