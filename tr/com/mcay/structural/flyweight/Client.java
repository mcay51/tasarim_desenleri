package tr.com.mcay.structural.flyweight;

/**
 * Client - Flyweight desenini kullanan sınıf
 * Flyweight nesnelerinin nasıl kullanılacağını gösterir
 */
public class Client {
    
    /**
     * Flyweight desenini gösteren ana metod
     * 
     * @param args Komut satırı argümanları (kullanılmıyor)
     */
    public static void main(String[] args) {
        // Karakter fabrikasını oluştur
        CharacterFactory factory = new CharacterFactory();
        
        // Gösterilecek örnek metin
        String text = "Hello Flyweight Pattern!";
        
        System.out.println("Metin gösteriliyor: \"" + text + "\"");
        System.out.println("------------------------------");
        
        // Metnin her karakterini farklı konumlarda göster
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            // Karakteri fabrikadan al (zaten varsa yeniden kullanılır)
            tr.com.mcay.structural.flyweight.Character character = factory.getCharacter(symbol);
            
            // Karakteri (i*10, 20) konumunda göster
            // Konum, flyweight'e iletilen dışsal durumdur
            character.display(i * 10, 20);
        }
        
        System.out.println("------------------------------");
        System.out.println("Oluşturulan toplam benzersiz karakter: " + factory.getCharacterCount());
        System.out.println("Metindeki toplam karakter: " + text.length());
        System.out.println("Bellek tasarrufu: " + (text.length() - factory.getCharacterCount()) + 
                           " karakter nesnesi");
    }
} 