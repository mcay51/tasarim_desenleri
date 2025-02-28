package tr.com.mcay.behavioral.iterator;

/**
 * IterableCollection arayüzü
 * Bu arayüz, üzerinde dolaşılabilir koleksiyonları tanımlar.
 * Iterator oluşturma yeteneğine sahip koleksiyonlar bu arayüzü uygular.
 */
public interface IterableCollection {
    
    /**
     * Koleksiyon için bir iterator nesnesi oluşturur
     * @return Iterator nesnesi
     */
    Iterator createIterator();
} 