package tr.com.mcay.structural.flyweight;

/**
 * ConcreteCharacter - Somut Flyweight uygulaması
 * Birden fazla bağlamda paylaşılabilen içsel durumu içerir
 */
public class ConcreteCharacter implements Character {
    // İçsel durum - bağlamlar arasında paylaşılır
    private final char symbol;
    private final String font;
    private final int size;
    private final String color;

    /**
     * Yapıcı metod içsel durumu başlatır
     * 
     * @param symbol Karakter sembolü
     * @param font   Karakterin yazı tipi
     * @param size   Karakterin boyutu
     * @param color  Karakterin rengi
     */
    public ConcreteCharacter(char symbol, String font, int size, String color) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    /**
     * Karakteri belirtilen konumda gösterir
     * Konum, istemci tarafından iletilen dışsal durumdur
     * 
     * @param positionX Karakterin gösterileceği X koordinatı
     * @param positionY Karakterin gösterileceği Y koordinatı
     */
    @Override
    public void display(int positionX, int positionY) {
        System.out.println("Karakter '" + symbol + "' şu konumda gösterildi (" + 
                           positionX + ", " + positionY + "), yazı tipi '" + 
                           font + "', boyut " + size + ", ve renk '" + color + "'");
    }
} 