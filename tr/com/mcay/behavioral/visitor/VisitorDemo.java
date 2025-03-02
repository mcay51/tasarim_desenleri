package tr.com.mcay.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * VisitorDemo sınıfı
 * Visitor tasarım deseninin nasıl kullanılacağını gösteren demo sınıfı
 */
public class VisitorDemo {
    
    public static void main(String[] args) {
        // Dosyaları oluştur
        List<File> files = new ArrayList<>();
        files.add(new TextFile("rapor.txt", "Bu bir rapor dosyasıdır. İçerisinde önemli bilgiler bulunmaktadır."));
        files.add(new TextFile("notlar.txt", "Toplantı notları: 1. Proje planı, 2. Görev dağılımı, 3. Zaman çizelgesi"));
        files.add(new ImageFile("logo.png", "512x512"));
        files.add(new ImageFile("banner.jpg", "1920x1080"));
        
        // Ziyaretçileri oluştur
        FileVisitor compressionVisitor = new CompressionVisitor();
        FileVisitor previewVisitor = new PreviewVisitor();
        
        // Sıkıştırma işlemi
        System.out.println("===== DOSYA SIKIŞTIRMA İŞLEMİ =====");
        for (File file : files) {
            file.accept(compressionVisitor);
            System.out.println();
        }
        
        // Önizleme işlemi
        System.out.println("\n===== DOSYA ÖNİZLEME İŞLEMİ =====");
        for (File file : files) {
            file.accept(previewVisitor);
            System.out.println();
        }
    }
} 