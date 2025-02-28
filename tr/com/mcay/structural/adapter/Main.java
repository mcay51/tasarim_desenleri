package tr.com.mcay.structural.adapter;

/**
 * Adapter tasarım deseninin örnek kullanımı
 */
public class Main {
    public static void main(String[] args) {
        // DbError kullanımı
        IError dbError = new DbError(1001, "Veritabanı bağlantı hatası");
        System.out.println("DB Hata No: " + dbError.getErrorNumber());
        System.out.println("DB Hata Açıklaması: " + dbError.getDescription());
        System.out.println();
        
        // ServiceError kullanımı
        IError serviceError = new ServiceError(2001, "Servis çağrısı başarısız");
        System.out.println("Servis Hata No: " + serviceError.getErrorNumber());
        System.out.println("Servis Hata Açıklaması: " + serviceError.getDescription());
        System.out.println();
        
        // Fax ve FaxAdapter kullanımı
        Fax fax = new Fax(3001, "Faks gönderimi başarısız");
        IError faxError = new FaxAdapter(fax);
        System.out.println("Fax Hata No: " + faxError.getErrorNumber());
        System.out.println("Fax Hata Açıklaması: " + faxError.getDescription());
        
        // Tüm hataları tek bir arayüz üzerinden işleme örneği
        System.out.println("\nTüm hataların listesi:");
        IError[] errors = {dbError, serviceError, faxError};
        for (IError error : errors) {
            System.out.println("Hata No: " + error.getErrorNumber() + ", Açıklama: " + error.getDescription());
        }
    }
} 