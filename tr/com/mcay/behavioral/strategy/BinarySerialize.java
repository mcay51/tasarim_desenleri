package tr.com.mcay.behavioral.strategy;

import java.util.Base64;

/**
 * İkili (Binary) serileştirme için somut strateji uygulaması
 */
public class BinarySerialize implements ISerializable {
    
    @Override
    public String serialize(Object data) {
        // Gerçek bir uygulamada, bu nesneyi ikili formata dönüştürüp kodlardı
        // Burada sadece Base64 kodlama ile simüle ediyoruz
        String stringData = data.toString();
        return Base64.getEncoder().encodeToString(stringData.getBytes());
    }
    
    @Override
    public Object deserialize(String data) {
        // Gerçek bir uygulamada, bu ikili veriyi çözüp nesneye dönüştürürdü
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(data);
            return new String(decodedBytes);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
} 