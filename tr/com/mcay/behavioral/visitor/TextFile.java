package tr.com.mcay.behavioral.visitor;

/**
 * TextFile sınıfı
 * Visitor tasarım desenindeki Concrete Element sınıfıdır
 * Metin dosyalarını temsil eder
 */
public class TextFile implements File {
    private String content;
    private String name;
    
    /**
     * TextFile sınıfı yapıcı metodu
     * @param name Dosya adı
     * @param content Dosya içeriği
     */
    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }
    
    /**
     * Ziyaretçiyi kabul eder ve ilgili ziyaret metodunu çağırır
     * @param visitor Dosyayı ziyaret edecek ziyaretçi
     */
    @Override
    public void accept(FileVisitor visitor) {
        visitor.visitTextFile(this);
    }
    
    /**
     * Dosya içeriğini döndürür
     * @return Dosya içeriği
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Dosya adını döndürür
     * @return Dosya adı
     */
    public String getName() {
        return name;
    }
} 