public class Main {
    public static void main(String[] args) {
        // Farklı sınıfları simüle eden metotları çağıralım
        userService();
        productService();
        paymentService();
    }
    
    // Kullanıcı servisi simülasyonu
    public static void userService() {
        Logger logger = Logger.getInstance();
        logger.log("Kullanıcı servisi başlatıldı");
        logger.log("Kullanıcı girişi yapıldı: user123");
    }
    
    // Ürün servisi simülasyonu
    public static void productService() {
        Logger logger = Logger.getInstance();
        logger.log("Ürün servisi başlatıldı");
        logger.log("Ürünler listelendi");
        
        // Log dosyasının adını değiştirelim
        logger.setLogFileName("products.log");
    }
    
    // Ödeme servisi simülasyonu
    public static void paymentService() {
        Logger logger = Logger.getInstance();
        logger.log("Ödeme servisi başlatıldı");
        logger.log("Ödeme işlemi tamamlandı");
        
        // Log dosyasının adını kontrol edelim
        System.out.println("Mevcut log dosyası: " + logger.getLogFileName());
        // Burada "products.log" göreceğiz çünkü tüm servisler aynı Logger örneğini kullanıyor
    }
} 