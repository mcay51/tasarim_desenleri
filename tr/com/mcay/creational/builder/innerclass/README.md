# Inner Class Builder Design Pattern

## Genel Bakış
Inner Class Builder deseni, klasik Builder deseninin daha modern ve kullanışlı bir varyasyonudur. Bu yaklaşım, builder sınıfını ürün sınıfının içinde static bir iç sınıf olarak tanımlar. Bu sayede daha temiz, güvenli ve akıcı bir API sunar.

## Kullanım Alanları
Inner Class Builder deseni şu durumlarda tercih edilir:
- İmmutable (değişmez) nesneler oluşturmak istediğinizde
- Nesne oluşturma sürecinde akıcı (fluent) bir API sunmak istediğinizde
- Zorunlu ve opsiyonel parametreleri yönetmek istediğinizde
- Nesne oluşturma sürecinde validasyon yapmak istediğinizde
- Teleskopik constructor probleminden kaçınmak istediğinizde

## Uygulama Adımları
1. Ana sınıfı ve tüm alanlarını final olarak tanımlayın (immutability için)
2. Ana sınıfın içinde static Builder sınıfını oluşturun
3. Ana sınıfın constructor'ını private yapın
4. Builder sınıfında akıcı (fluent) metotlar tanımlayın
5. Build metodunda gerekli validasyonları yapın

## UML Diyagramı

```mermaid

classDiagram
    class Kisi {
        -final String ad
        -final String soyad
        -final int yas
        -final String adres
        -final String telefon
        -Kisi(Builder builder)
        +getAd() String
        +getSoyad() String
        +getYas() int
        +getAdres() String
        +getTelefon() String
    }
    
    class Builder {
        -String ad
        -String soyad
        -int yas
        -String adres
        -String telefon
        +Builder()
        +Builder(String ad, String soyad)
        +ad(String ad) Builder
        +soyad(String soyad) Builder
        +yas(int yas) Builder
        +adres(String adres) Builder
        +telefon(String telefon) Builder
        +build() Kisi
    }
    Kisi "1" -- "1" Builder: has-a    Builder "1" -- "1" Kisi: creates
```



## Avantajlar ve Dezavantajlar

### Avantajlar
1. **İmmutability**: Nesnelerin değişmezliğini sağlar, bu da thread-safety açısından önemlidir.
2. **Akıcı API**: Method chaining ile daha okunabilir kod yazmanızı sağlar.
3. **Validasyon**: Nesne oluşturulurken gerekli kontrollerin yapılmasını sağlar.
4. **Esneklik**: Zorunlu ve opsiyonel parametreleri kolayca yönetebilirsiniz.
5. **Okunabilirlik**: Çok parametreli constructor'lar yerine daha anlaşılır bir yapı sunar.

### Dezavantajlar
1. **Kod Miktarı**: Basit sınıflar için fazla kod gerektirebilir.
2. **Karmaşıklık**: Basit kullanım durumları için fazla karmaşık olabilir.

## Örnek Uygulama

Bu örnekte, bir Kişi sınıfı için Inner Class Builder deseni kullanılmıştır:



## Çıktı Örneği

```
Kişi Bilgileri:
Ad: Ahmet
Soyad: Yılmaz
Yaş: 30
Adres: İstanbul
Telefon: 555-1234567

Kişi Bilgileri:
Ad: Ayşe
Soyad: Demir
Yaş: 25
Adres: null
Telefon: null
```

Inner Class Builder deseni, özellikle Java dünyasında yaygın olarak kullanılan ve modern bir yaklaşım sunan bir tasarım desenidir. Lombok gibi kütüphaneler sayesinde bu deseni otomatik olarak oluşturmak da mümkündür.