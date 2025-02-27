public class Logger {
    // Sınıfın tek örneğini tutacak statik değişken
    private static Logger instance;
    
    // Log dosyasının adı
    private String logFileName;
    
    // Private constructor - dışarıdan erişimi engellemek için
    private Logger() {
        this.logFileName = "application.log";
        System.out.println("Logger başlatıldı. Log dosyası: " + logFileName);
    }
    
    // Singleton örneğini döndüren metod
    public static Logger getInstance() {
        // Eğer instance henüz oluşturulmadıysa oluştur (lazy initialization)
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Log mesajı yazan metod
    public void log(String message) {
        System.out.println("[LOG] " + message);
        // Gerçek uygulamada burada dosyaya yazma işlemi yapılabilir
    }
    
    // Log dosyasının adını değiştiren metod
    public void setLogFileName(String fileName) {
        this.logFileName = fileName;
        System.out.println("Log dosyası değiştirildi: " + fileName);
    }
    
    // Log dosyasının adını döndüren metod
    public String getLogFileName() {
        return this.logFileName;
    }
} 