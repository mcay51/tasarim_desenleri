# Proxy Design Pattern

## Genel Bakış
Proxy (Vekil) tasarım deseni, bir nesneye erişimi kontrol etmek için o nesnenin yerine geçebilen bir vekil nesne kullanma mantığına dayanan yapısal bir tasarım desenidir. Asıl nesnenin yerine geçerek, istemci ile asıl nesne arasında bir aracı görevi görür.

## Kullanım Alanları
- Büyük boyutlu nesnelerin lazy loading (geç yükleme) işlemleri
- Uzak sunucu bağlantılarında (Remote Proxy)
- Erişim kontrolü gerektiren durumlarda (Protection Proxy)
- Cache mekanizması gereken durumlarda (Cache Proxy)
- Loglama ve izleme gerektiren işlemlerde

## Uygulama Adımları
1. Asıl nesne ve proxy için ortak bir arayüz tanımlama
2. Asıl nesneyi (RealSubject) oluşturma
3. Proxy sınıfını oluşturma ve asıl nesneye referans verme
4. Proxy üzerinden gerekli kontrol ve yönlendirmeleri yapma

## UML Diyagramı

```mermaid
classDiagram
    class Subject {
        <<interface>>
        +request()
    }
    
    class RealSubject {
        +request()
    }
    
    class Proxy {
        -realSubject: RealSubject
        +request()
    }
    
    Subject <|.. RealSubject
    Subject <|.. Proxy
    Proxy --> RealSubject
    Client --> Subject
```

## Avantajlar
- Asıl nesneye erişimi kontrol eder
- Güvenlik katmanı sağlar
- Performans optimizasyonu sağlar
- Lazy loading imkanı sunar
- Asıl nesnenin kullanımını optimize eder

## Dezavantajlar
- Ekstra bir katman eklediği için yanıt süresini artırabilir
- Kodun karmaşıklığını artırabilir
- Bazı durumlarda gereksiz proxy oluşturulabilir

Örnek senaryo: Bir okul yönetim sisteminde, tüm öğrenci bilgilerini içeren büyük bir nesne yerine, sadece ihtiyaç duyulan öğrenci bilgilerine erişim sağlayan bir proxy kullanılabilir. Bu sayede sistem kaynakları daha verimli kullanılır ve gereksiz veri yüklemelerinin önüne geçilir.

```mermaid
classDiagram
    class IOgrenciService {
        <<interface>>
        +getOgrenciBilgileri(id: int)
    }
    
    class OgrenciService {
        -tumOgrenciler: List
        +getOgrenciBilgileri(id: int)
    }
    
    class OgrenciServiceProxy {
        -ogrenciService: OgrenciService
        -cache: Map
        +getOgrenciBilgileri(id: int)
    }
    
    IOgrenciService <|.. OgrenciService
    IOgrenciService <|.. OgrenciServiceProxy
    OgrenciServiceProxy --> OgrenciService
```

proxy, gerçek servise erişimi kontrol eder, cache mekanizması sağlar ve sadece gerekli durumlarda asıl servisi çağırır.