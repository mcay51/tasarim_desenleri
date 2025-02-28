# Abstract Factory Design Pattern

## Genel Bakış

Abstract Factory Design Pattern, birbirleriyle ilişkili veya bağımlı nesnelerin ailelerini, somut sınıflarını belirtmeden oluşturmak için bir arayüz sağlayan bir tasarım desenidir. Bu desen, Creational Patterns (Oluşturucu Kalıplar) kategorisine girer ve Factory Method deseninin genişletilmiş bir versiyonu olarak düşünülebilir.

Factory Method deseninden farklı olarak, Abstract Factory birden fazla ürün ailesini destekler ve her ürün ailesi için ayrı fabrika sınıfları kullanır. Bu sayede, istemci kod belirli bir ürün ailesiyle çalışabilir ancak bu ürünlerin nasıl oluşturulduğu veya hangi sınıfların kullanıldığı hakkında bilgi sahibi olmak zorunda kalmaz.

## Kullanım Alanları

1. **Çoklu Platform Uygulamaları**: Farklı işletim sistemleri veya platformlar için farklı UI bileşenleri oluşturma.
2. **Tema Sistemleri**: Farklı temalar için uyumlu bileşenler oluşturma (açık/koyu tema gibi).
3. **Veritabanı Sistemleri**: Farklı veritabanı teknolojileri için uyumlu bağlantı ve sorgu nesneleri oluşturma.
4. **Çoklu İstemci Desteği**: Farklı istemci türleri için uyumlu servisler oluşturma (web, mobil, masaüstü).
5. **Test Sistemleri**: Gerçek ve test ortamları için farklı nesne aileleri oluşturma.

## Uygulama Adımları

1. **Abstract Product Arayüzleri Tanımlama**: Her ürün türü için soyut arayüzler oluşturma.
2. **Concrete Product Sınıfları Oluşturma**: Her ürün ailesi için somut ürün sınıfları oluşturma.
3. **Abstract Factory Arayüzü Tanımlama**: Tüm ürün türlerini oluşturacak metotları içeren soyut fabrika arayüzü tanımlama.
4. **Concrete Factory Sınıfları Oluşturma**: Her ürün ailesi için somut fabrika sınıfları oluşturma.
5. **İstemci Kodu Yazma**: Soyut fabrika ve ürün arayüzlerini kullanarak istemci kodunu yazma.

## UML Diyagramı
````mermaid
classDiagram
%% Soyut Ürün Arayüzleri
class IEmailNotification {
<<interface>>
+sendEmail()
}

class ISmsNotification {
<<interface>>
+sendSms()
}

%% Somut Ürünler - Acil Bildirimler
class AcilEmailNotification {
+sendEmail()
}

class AcilSmsNotification {
+sendSms()
}

%% Somut Ürünler - Standart Bildirimler
class StandardEmailNotification {
+sendEmail()
}

class StandardSmsNotification {
+sendSms()
}

%% Soyut Fabrika Arayüzü
class INotificationFactory {
<<interface>>
+createEmailNotification() IEmailNotification
+createSmsNotification() ISmsNotification
}

%% Somut Fabrikalar
class AcilNotificationFactory {
+createEmailNotification() IEmailNotification
+createSmsNotification() ISmsNotification
}

class StandardNotificationFactory {
+createEmailNotification() IEmailNotification
+createSmsNotification() ISmsNotification
}

%% İstemci Sınıfı
class NotificationClient {
-factory: INotificationFactory
+sendNotifications()
}

%% İlişkiler - Kalıtım
IEmailNotification <|.. AcilEmailNotification
IEmailNotification <|.. StandardEmailNotification
ISmsNotification <|.. AcilSmsNotification
ISmsNotification <|.. StandardSmsNotification
INotificationFactory <|.. AcilNotificationFactory
INotificationFactory <|.. StandardNotificationFactory

%% İlişkiler - Bağımlılıklar
AcilNotificationFactory ..> AcilEmailNotification : creates
AcilNotificationFactory ..> AcilSmsNotification : creates
StandardNotificationFactory ..> StandardEmailNotification : creates
StandardNotificationFactory ..> StandardSmsNotification : creates

%% İstemci İlişkileri
NotificationClient --> INotificationFactory : uses
NotificationClient ..> IEmailNotification : uses
NotificationClient ..> ISmsNotification : uses

````

## Avantajlar ve Dezavantajlar

### Avantajlar

1. **Ürün Ailelerinin Uyumluluğu**: Bir ürün ailesindeki nesnelerin birbiriyle uyumlu olmasını garantiler.
2. **Yüksek Soyutlama**: İstemci kodu, somut sınıflardan tamamen soyutlanır.
3. **Açık/Kapalı Prensibi**: Yeni ürün aileleri eklemek için mevcut kodu değiştirmek gerekmez.
4. **Tek Sorumluluk Prensibi**: Nesne oluşturma mantığı, fabrika sınıflarında toplanır.
5. **Değiştirilebilirlik**: Çalışma zamanında farklı ürün aileleri arasında geçiş yapılabilir.

### Dezavantajlar

1. **Karmaşıklık**: Basit senaryolarda gereksiz karmaşıklık getirebilir.
2. **Yeni Ürün Ekleme Zorluğu**: Mevcut bir ürün ailesine yeni bir ürün türü eklemek zordur, tüm fabrikaları güncellemeniz gerekir.
3. **Kod Tekrarı**: Benzer fabrika sınıfları arasında kod tekrarı olabilir.
4. **Sınıf Sayısı**: Çok sayıda arayüz ve sınıf oluşturulması gerekir.

## Notification Service Örneğini Abstract Factory'ye Uyarlama

Önceki Factory Method örneğini Abstract Factory desenine uyarlayabiliriz. Bu durumda, farklı bildirim kanalları (email, SMS, push) yerine farklı bildirim aileleri oluşturacağız. Örneğin:

1. **Bildirim Kanalları**: Email, SMS, Push
2. **Bildirim Aileleri**: Acil Bildirimler, Standart Bildirimler, Pazarlama Bildirimleri

Her bildirim ailesi, her kanal için farklı davranışlara sahip olabilir.


Bu örnekte, Factory Method deseninden farklı olarak, artık her bildirim kanalı için ayrı bir fabrika değil, her bildirim ailesi için bir fabrika oluşturduk. Her fabrika, tüm bildirim kanallarını (email, SMS, push) oluşturabilir, ancak bunları kendi ailesinin özelliklerine göre (acil veya standart) oluşturur.

Bu yaklaşım, yeni bir bildirim kanalı eklemek istediğimizde (örneğin, web bildirimleri) tüm fabrikaları güncellememiz gerektiği anlamına gelir, ancak yeni bir bildirim ailesi eklemek (örneğin, pazarlama bildirimleri) sadece yeni bir fabrika sınıfı oluşturmayı gerektirir.
## Abstract Factory Tasarım Deseni Uygulaması

Bu uygulama, Abstract Factory (Soyut Fabrika) tasarım desenini bildirim sistemi üzerinden göstermektedir. İki farklı bildirim türü (Email ve SMS) ve iki farklı bildirim önceliği (Acil ve Standart) bulunmaktadır.

### Proje Yapısı

1. **Soyut Ürün Arayüzleri**:
   - `IEmailNotification`: Email bildirimleri için arayüz
   - `ISmsNotification`: SMS bildirimleri için arayüz

2. **Somut Ürünler**:
   - `AcilEmailNotification`: Acil email bildirimleri
   - `AcilSmsNotification`: Acil SMS bildirimleri
   - `StandardEmailNotification`: Standart email bildirimleri
   - `StandardSmsNotification`: Standart SMS bildirimleri

3. **Soyut Fabrika Arayüzü**:
   - `INotificationFactory`: Bildirim fabrikası arayüzü

4. **Somut Fabrikalar**:
   - `AcilNotificationFactory`: Acil bildirimler için fabrika
   - `StandardNotificationFactory`: Standart bildirimler için fabrika

5. **İstemci Sınıfı**:
   - `NotificationClient`: Bildirimleri gönderen istemci sınıfı

6. **Ana Sınıf**:
   - `Main`: Uygulamayı çalıştıran ana sınıf

### Tasarım Deseninin Çalışma Mantığı

1. İstemci (`NotificationClient`), soyut fabrika arayüzünü (`INotificationFactory`) kullanır.
2. Çalışma zamanında, istemciye hangi fabrika türünün (Acil veya Standart) kullanılacağı enjekte edilir.
3. İstemci, fabrika arayüzü üzerinden ürünleri (Email ve SMS bildirimleri) oluşturur.
4. İstemci, somut ürünlerin hangi türde olduğunu bilmeden onları kullanabilir.

### Örnek Çalıştırma

`Main` sınıfı çalıştırıldığında:

1. Önce acil bildirim fabrikası oluşturulur ve istemciye verilir.
2. İstemci, acil bildirimleri gönderir.
3. Sonra standart bildirim fabrikası oluşturulur ve istemciye verilir.
4. İstemci, standart bildirimleri gönderir.

Bu şekilde, istemci kodu değiştirilmeden farklı türde bildirimler gönderilebilir. Bu, Abstract Factory tasarım deseninin temel avantajıdır.
