package tr.com.mcay.behavioral.strategy;

/**
 * Serileştirme işlemlerini tanımlayan Strateji arayüzü
 */
public interface ISerializable {
    /**
     * Veriyi string formatına serileştirir
     * @param data Serileştirilecek veri
     * @return Serileştirilmiş string gösterimi
     */
    String serialize(Object data);
    
    /**
     * String veriyi tekrar nesneye dönüştürür
     * @param data Serileştirilmiş veriyi temsil eden string
     * @return Serileştirilmemiş nesne
     */
    Object deserialize(String data);
} 