package tr.com.mcay.structural.flyweight;

/**
 * Character arayüzü - Flyweight arayüzü
 * Somut flyweight sınıflarının uygulaması gereken metodu tanımlar
 */
public interface Character {
    /**
     * Karakteri belirtilen konumda gösterir
     * 
     * @param positionX Karakterin gösterileceği X koordinatı
     * @param positionY Karakterin gösterileceği Y koordinatı
     */
    void display(int positionX, int positionY);
} 