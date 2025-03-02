package tr.com.mcay.behavioral.visitor;

/**
 * PreviewVisitor sınıfı
 * Visitor tasarım desenindeki Concrete Visitor sınıfıdır
 * Dosyaların önizlemesini gerçekleştirir
 */
public class PreviewVisitor implements FileVisitor {
    
    /**
     * Metin dosyasını ziyaret eder ve önizleme işlemini gerçekleştirir
     * @param file Ziyaret edilecek metin dosyası
     */
    @Override
    public void visitTextFile(TextFile file) {
        System.out.println(file.getName() + " isimli metin dosyası önizleniyor...");
        System.out.println("İçerik önizlemesi: " + file.getContent().substring(0, Math.min(file.getContent().length(), 50)) + "...");
    }
    
    /**
     * Resim dosyasını ziyaret eder ve önizleme işlemini gerçekleştirir
     * @param file Ziyaret edilecek resim dosyası
     */
    @Override
    public void visitImageFile(ImageFile file) {
        System.out.println(file.getName() + " isimli resim dosyası önizleniyor...");
        System.out.println("Resim çözünürlüğü: " + file.getResolution());
        System.out.println("Küçük önizleme gösteriliyor...");
    }
} 