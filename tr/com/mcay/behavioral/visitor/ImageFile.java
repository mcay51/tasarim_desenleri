package tr.com.mcay.behavioral.visitor;

/**
 * ImageFile sınıfı
 * Visitor tasarım desenindeki Concrete Element sınıfıdır
 * Resim dosyalarını temsil eder
 */
public class ImageFile implements File {
    private String resolution;
    private String name;
    
    /**
     * ImageFile sınıfı yapıcı metodu
     * @param name Dosya adı
     * @param resolution Resim çözünürlüğü
     */
    public ImageFile(String name, String resolution) {
        this.name = name;
        this.resolution = resolution;
    }
    
    /**
     * Ziyaretçiyi kabul eder ve ilgili ziyaret metodunu çağırır
     * @param visitor Dosyayı ziyaret edecek ziyaretçi
     */
    @Override
    public void accept(FileVisitor visitor) {
        visitor.visitImageFile(this);
    }
    
    /**
     * Resim çözünürlüğünü döndürür
     * @return Resim çözünürlüğü
     */
    public String getResolution() {
        return resolution;
    }
    
    /**
     * Dosya adını döndürür
     * @return Dosya adı
     */
    public String getName() {
        return name;
    }
} 