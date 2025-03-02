package tr.com.mcay.behavioral.visitor;

/**
 * FileVisitor arayüzü
 * Visitor tasarım deseninin temel arayüzüdür
 * Her bir dosya türü için ziyaret metotlarını tanımlar
 */
public interface FileVisitor {
    /**
     * Metin dosyasını ziyaret eder
     * @param file Ziyaret edilecek metin dosyası
     */
    void visitTextFile(TextFile file);
    
    /**
     * Resim dosyasını ziyaret eder
     * @param file Ziyaret edilecek resim dosyası
     */
    void visitImageFile(ImageFile file);
} 