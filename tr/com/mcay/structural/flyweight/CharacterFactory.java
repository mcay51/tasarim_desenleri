package tr.com.mcay.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * CharacterFactory - Flyweight Fabrikası
 * Flyweight nesnelerini oluşturur ve yönetir
 */
public class CharacterFactory {
    // Flyweight nesnelerinin havuzu
    private final Map<java.lang.Character, Character> characters = new HashMap<java.lang.Character, Character>();
    
    // Varsayılan karakter özellikleri
    private static final String DEFAULT_FONT = "Arial";
    private static final int DEFAULT_SIZE = 12;
    private static final String DEFAULT_COLOR = "Black";

    /**
     * Havuzda varsa karakter nesnesini döndürür,
     * yoksa yeni bir tane oluşturur ve havuza ekler
     * 
     * @param symbol Alınacak veya oluşturulacak karakter sembolü
     * @return Character flyweight nesnesi
     */
    public tr.com.mcay.structural.flyweight.Character getCharacter(char symbol) {
        // Sembolü anahtar olarak kullan
        char key = symbol;
        
        // Karakterin havuzda zaten var olup olmadığını kontrol et
        if (!characters.containsKey(key)) {
            // Yoksa, varsayılan özelliklerle yeni bir tane oluştur
            characters.put(key, new ConcreteCharacter(symbol, DEFAULT_FONT, DEFAULT_SIZE, DEFAULT_COLOR));
            System.out.println("Yeni karakter oluşturuluyor: '" + symbol + "'");
        } else {
            System.out.println("Var olan karakter yeniden kullanılıyor: '" + symbol + "'");
        }
        
        // Karakteri havuzdan döndür
        return characters.get(key);
    }
    
    /**
     * Karakter havuzunun mevcut boyutunu döndürür
     * 
     * @return Havuzdaki benzersiz karakter sayısı
     */
    public int getCharacterCount() {
        return characters.size();
    }
} 