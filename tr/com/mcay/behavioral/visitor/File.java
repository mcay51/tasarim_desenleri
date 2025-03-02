package tr.com.mcay.behavioral.visitor;

/**
 * File arayüzü
 * Visitor tasarım desenindeki Element arayüzüdür
 * Ziyaretçileri kabul eden metodu tanımlar
 */
public interface File {
    /**
     * Ziyaretçiyi kabul eder
     * @param visitor Dosyayı ziyaret edecek ziyaretçi
     */
    void accept(FileVisitor visitor);
} 