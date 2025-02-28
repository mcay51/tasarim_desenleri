package tr.com.mcay.behavioral.iterator;

/**
 * Iterator tasarım deseninin kullanımını gösteren demo sınıfı
 */
public class IteratorDemo {
    
    public static void main(String[] args) {
        // Alışveriş sepeti oluştur
        AlisverisSepeti sepet = new AlisverisSepeti();
        
        // Sepete ürünler ekle
        sepet.addItem("Elma");
        sepet.addItem("Ekmek");
        sepet.addItem("Süt");
        sepet.addItem("Peynir");
        sepet.addItem("Yoğurt");
        
        // Iterator oluştur
        Iterator iterator = sepet.createIterator();
        
        // Sepetteki tüm ürünleri dolaş ve ekrana yazdır
        System.out.println("Sepetteki Ürünler:");
        while (iterator.hasNext()) {
            String urun = (String) iterator.next();
            System.out.println("- " + urun);
        }
    }
} 