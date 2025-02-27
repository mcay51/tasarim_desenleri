// Paket bilgisi ekliyorum
package tr.com.mcay.creational.singleton;

public class Logger {
    // Volatile anahtar kelimesi, değişkenin farklı thread'ler tarafından doğru şekilde görülmesini sağlar
    private static volatile Logger instance;
    
    // Log dosyasının adı
    private String logFileName;
    
    // Private constructor - dışarıdan erişimi engellemek için
    private Logger() {
        this.logFileName = "application.log";
        System.out.println("Logger başlatıldı. Log dosyası: " + logFileName);
    }
    
    // Thread-safe singleton örneğini döndüren metod (Double-Checked Locking)
    public static Logger getInstance() {
        // İlk kontrol - senkronizasyon maliyetini azaltmak için
        if (instance == null) {
            // Senkronize blok - yalnızca bir thread bu bloğa girebilir
            synchronized (Logger.class) {
                // İkinci kontrol - başka bir thread zaten instance'ı oluşturmuş olabilir
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Log mesajı yazan metod
    public void log(String message) {
        System.out.println("[LOG] " + message);
        // Gerçek uygulamada burada dosyaya yazma işlemi yapılabilir
    }
    
    // Log dosyasının adını değiştiren metod - thread güvenliği için senkronize edildi
    public synchronized void setLogFileName(String fileName) {
        this.logFileName = fileName;
        System.out.println("Log dosyası değiştirildi: " + fileName);
    }
    
    // Log dosyasının adını döndüren metod
    public String getLogFileName() {
        return this.logFileName;
    }
} 