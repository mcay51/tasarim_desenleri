package tr.com.mcay.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * AlisverisSepeti sınıfı
 * Bu sınıf, alışveriş sepetini temsil eder ve IterableCollection arayüzünü uygular.
 * Sepete ürün ekleme ve sepet üzerinde dolaşmak için iterator oluşturma yeteneklerine sahiptir.
 */
public class AlisverisSepeti implements IterableCollection {
    
    /**
     * Sepetteki ürünleri tutan liste
     */
    private List<String> items;
    
    /**
     * Yapıcı metot
     * Boş bir alışveriş sepeti oluşturur
     */
    public AlisverisSepeti() {
        this.items = new ArrayList<>();
    }
    
    /**
     * Sepete yeni bir ürün ekler
     * @param item Eklenecek ürün
     */
    public void addItem(String item) {
        this.items.add(item);
    }
    
    /**
     * Sepet için bir iterator nesnesi oluşturur
     * @return SepetIterator nesnesi
     */
    @Override
    public Iterator createIterator() {
        return new SepetIterator(this.items);
    }
} 