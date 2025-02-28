package tr.com.mcay.behavioral.strategy;

/**
 * XML serileştirme için somut strateji uygulaması
 */
public class XmlSerialize implements ISerializable {
    
    @Override
    public String serialize(Object data) {
        // Gerçek bir uygulamada, bu nesneyi XML'e dönüştürürdü
        return "<xml>" + data.toString() + "</xml>";
    }
    
    @Override
    public Object deserialize(String data) {
        // Gerçek bir uygulamada, bu XML'i tekrar nesneye dönüştürürdü
        if (data.startsWith("<xml>") && data.endsWith("</xml>")) {
            return data.substring(5, data.length() - 6);
        }
        return null;
    }
} 