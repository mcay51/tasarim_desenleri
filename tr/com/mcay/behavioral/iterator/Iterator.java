package tr.com.mcay.behavioral.iterator;

/**
 * Iterator arayüzü
 * Bu arayüz, bir koleksiyondaki elemanları dolaşmak için gerekli metotları tanımlar.
 */
public interface Iterator {
    
    /**
     * Koleksiyonda başka eleman olup olmadığını kontrol eder
     * @return Başka eleman varsa true, yoksa false döner
     */
    boolean hasNext();
    
    /**
     * Koleksiyondaki bir sonraki elemanı döndürür
     * @return Bir sonraki eleman
     */
    Object next();
} 