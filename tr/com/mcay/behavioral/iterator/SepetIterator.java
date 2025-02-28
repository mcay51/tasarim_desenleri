package tr.com.mcay.behavioral.iterator;

import java.util.List;

/**
 * SepetIterator sınıfı
 * Bu sınıf, AlisverisSepeti koleksiyonu üzerinde dolaşmak için Iterator arayüzünü uygular.
 * Sepetteki ürünler üzerinde sırayla dolaşmayı sağlar.
 */
public class SepetIterator implements Iterator {
    
    /**
     * Üzerinde dolaşılacak ürün listesi
     */
    private List<String> items;
    
    /**
     * Şu anki konum indeksi
     */
    private int index;
    
    /**
     * Yapıcı metot
     * @param items Üzerinde dolaşılacak ürün listesi
     */
    public SepetIterator(List<String> items) {
        this.items = items;
        this.index = 0;
    }
    
    /**
     * Listede başka eleman olup olmadığını kontrol eder
     * @return Başka eleman varsa true, yoksa false döner
     */
    @Override
    public boolean hasNext() {
        return index < items.size();
    }
    
    /**
     * Listedeki bir sonraki elemanı döndürür
     * @return Bir sonraki eleman
     */
    @Override
    public Object next() {
        if (this.hasNext()) {
            return items.get(index++);
        }
        return null;
    }
} 