package tr.com.mcay.behavioral.visitor;

/**
 * CompressionVisitor sınıfı
 * Visitor tasarım desenindeki Concrete Visitor sınıfıdır
 * Dosyaları sıkıştırma işlemini gerçekleştirir
 */
public class CompressionVisitor implements FileVisitor {
    
    /**
     * Metin dosyasını ziyaret eder ve sıkıştırma işlemini gerçekleştirir
     * @param file Ziyaret edilecek metin dosyası
     */
    @Override
    public void visitTextFile(TextFile file) {
        System.out.println(file.getName() + " isimli metin dosyası ZIP formatında sıkıştırılıyor...");
        System.out.println("İçerik: " + file.getContent());
        System.out.println("Sıkıştırma tamamlandı.");
    }
    
    /**
     * Resim dosyasını ziyaret eder ve sıkıştırma işlemini gerçekleştirir
     * @param file Ziyaret edilecek resim dosyası
     */
    @Override
    public void visitImageFile(ImageFile file) {
        System.out.println(file.getName() + " isimli resim dosyası PNG formatında sıkıştırılıyor...");
        System.out.println("Çözünürlük: " + file.getResolution());
        System.out.println("Sıkıştırma tamamlandı.");
    }
} 