# Factory Method Design Pattern - Enum Tabanlı Örnek

## Genel Bakış
Factory Method tasarım kalıbı , kalıtımsal ilişkileri olan nesnelerin üretilmesi amacıyla kullanılan patternlerden birisidir. Burada asıl olan bir metottur. Bu metodun üstlendiği iş ise istemcinin ihtiyacı olan asıl ürünlerin üretilmesini sağlamak.
Fabrika metodunun özelliği istemciden gelen talebe göre uygun olan ürünün üretilip istemciye verilmesidir. 
Bu Factory Method versiyonunda, ürün tiplerini bir enum ile tanımlayıp, private constructor'a sahip bir Factory sınıfı içinde `public static create(UrunType type)` metodu ile ürün oluşturuyoruz. Bu yaklaşım, daha basit ve merkezi bir nesne yaratma mekanizması sağlar.

## Kullanım Alanları
- Raporlama sistemleri (PDF, Excel, HTML raporları)
- Bildirim servisleri (Email, SMS, Push bildirimleri)
- Ödeme işlemleri (Kredi kartı, Havale, Kapıda ödeme)

## Uygulama Adımları
1. Ürün tipleri için bir enum tanımla
2. Ürünler için ortak bir arayüz tanımla
3. Her ürün bu arayüzü uygulasın
4. Private constructor'a sahip bir Factory sınıfı oluştur
5. Factory içinde `public static create(UrunType type)` metodu tanımla
6. İstemci kod, Factory'nin create metodunu kullanarak ürün oluştursun

## UML Diyagramı - Bildirim Servisi Örneği

```mermaid
classDiagram
    class NotificationType {
        <<enum>>
        EMAIL
        SMS
        PUSH
    }
    
    class INotificationService {
        <<interface>>
        +send(message: String, target: String) void
    }
    
    class EmailNotificationService {
        -smtpServer: String
        +send(message: String, target: String) void
    }
    
    class SmsNotificationService {
        -smsGateway: String
        +send(message: String, target: String) void
    }
    
    class PushNotificationService {
        -pushProvider: String
        +send(message: String, target: String) void
    }
    
    class NotificationFactory {
        -NotificationFactory() 
        +static create(type: NotificationType) INotificationService
    }
    
    INotificationService <|.. EmailNotificationService
    INotificationService <|.. SmsNotificationService
    INotificationService <|.. PushNotificationService
    
    NotificationFactory ..> INotificationService : creates
    NotificationFactory ..> NotificationType : uses
    
    note for NotificationFactory "private NotificationFactory() {\n  // Private constructor\n}\n\npublic static INotificationService create(NotificationType type) {\n  switch(type) {\n    case EMAIL:\n      return new EmailNotificationService();\n    case SMS:\n      return new SmsNotificationService();\n    case PUSH:\n      return new PushNotificationService();\n    default:\n      throw new IllegalArgumentException();\n  }\n}"
```



## Avantajlar
1. Merkezi nesne yaratma - tek bir noktadan kontrol
2. Enum ile tip güvenliği sağlanır
3. Kolay kullanım - tek bir statik metod çağrısı
4. Nesne yaratma mantığı tek bir yerde toplanır

## Dezavantajlar
1. Yeni bir tip eklemek için Factory sınıfını değiştirmek gerekir (OCP ilkesine aykırı)
2. Singleton gibi davranır, test edilebilirliği azaltabilir
3. Çok karmaşık nesne yaratma senaryoları için yetersiz kalabilir

Bu yaklaşım, özellikle sabit sayıda ve iyi tanımlanmış ürün tipleri olduğunda kullanışlıdır. Enum kullanımı, tip güvenliği sağlar ve yanlış tip gönderme riskini azaltır.