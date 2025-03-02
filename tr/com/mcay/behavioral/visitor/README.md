### **Visitor Design Pattern**

---

#### **Genel Bakış**
Visitor Design Pattern, bir sınıfa (veya sınıf hiyerarşisine) o sınıfın kodunda değişiklik yapmadan yeni fonksiyonellik eklemeyi sağlayan bir tasarım desenidir. Bu desen, ziyaret edilen sınıfların kendi işlevselliğini değiştirmeden, dışarıdan gelen bir "ziyaretçi" sınıfının bu işlevselliği gerçekleştirmesine olanak tanır.

Visitor Design Pattern, özellikle karmaşık nesne yapılarında farklı işlemleri kolayca uygulamak için kullanışlıdır. Esas mantığı, nesne yapısını ve işlemi birbirinden ayırmaktır.

---

#### **Kullanım Alanları**
- **Karmaşık Nesne Yapıları**: Bir nesne yapısı üzerinde farklı işlemler yapılması gerektiğinde.
- **Yeni İşlevsellik Eklemek**: Mevcut sınıfları değiştirmeden yeni davranışlar eklemek gerektiğinde.
- **Çapraz İşlemler**: Farklı sınıflar arasında ortak işlemler gerektiğinde.
- **Örnek Senaryolar**:
    - Dosya sistemlerinde (farklı türde dosyalar için farklı işlemler).
    - Finansal işlemlerde (farklı hesap türleri için farklı işlemler).
    - Oyunlarda (farklı karakter türleri için ayrı işlemler).

---

#### **Uygulama Adımları**
1. **Visitor Arayüzü**:
    - Ziyaret edilecek sınıflara uygulanacak işlemleri tanımlar.
2. **Concrete Visitor (Somut Ziyaretçi)**:
    - Visitor arayüzünü uygulayan ve belirli bir işlemi gerçekleştiren sınıf.
3. **Element Arayüzü**:
    - Ziyaretçi tarafından ziyaret edilebilecek sınıfları tanımlar.
4. **Concrete Element (Somut Eleman)**:
    - Element arayüzünü uygulayan sınıf. Ziyaretçinin çağrılmasını sağlar.
5. **Client (Müşteri)**:
    - Visitor sınıfını, element sınıflarına uygular.

---

#### **UML Diyagramı**

Aşağıda Visitor Design Pattern için bir UML diyagramı bulunmaktadır:

````mermaid
  classDiagram
      class Visitor {
          <<interface>>
          +visitConcreteElementA(element: ConcreteElementA): void
          +visitConcreteElementB(element: ConcreteElementB): void
      }

      class ConcreteVisitor1 {
          <<Concrete Visitor>>
          +visitConcreteElementA(element: ConcreteElementA): void
          +visitConcreteElementB(element: ConcreteElementB): void
      }

      class ConcreteVisitor2 {
          <<Concrete Visitor>>
          +visitConcreteElementA(element: ConcreteElementA): void
          +visitConcreteElementB(element: ConcreteElementB): void
      }

      class Element {
          <<interface>>
          +accept(visitor: Visitor): void
      }

      class ConcreteElementA {
          <<Concrete Element>>
          +accept(visitor: Visitor): void
          +operationA(): void
      }

      class ConcreteElementB {
          <<Concrete Element>>
          +accept(visitor: Visitor): void
          +operationB(): void
      }

      Visitor <|.. ConcreteVisitor1
      Visitor <|.. ConcreteVisitor2
      Element <|.. ConcreteElementA
      Element <|.. ConcreteElementB
      ConcreteElementA --> Visitor : accept(visitor)
      ConcreteElementB --> Visitor : accept(visitor)
````

---

#### **Avantajlar**
1. **Yeni İşlevsellik Eklemek Kolaydır**:
    - Mevcut sınıfları değiştirmeden yeni ziyaretçiler eklenebilir.
2. **Tek Sorumluluk İlkesi**:
    - Sınıflar, kendi sorumluluklarına odaklanır ve ek işlevsellik ziyaretçi tarafından sağlanır.
3. **Karmaşık İşlemler Basitleştirilir**:
    - Nesne yapısı ve işlemler birbirinden ayrılır.

---

#### **Dezavantajlar**
1. **Ziyaretçi ve Elemanlar Arasında Sıkı Bağlılık**:
    - Ziyaretçi, elemanların iç yapısını bilmek zorundadır.
2. **Yeni Eleman Eklemek Zordur**:
    - Yeni bir eleman eklemek, tüm ziyaretçilerin güncellenmesini gerektirir.
3. **Karmaşıklık**:
    - Küçük projelerde gereksiz bir karmaşıklık oluşturabilir.

---

#### **Örnek: Dosya Sistemi**
Bir dosya sistemi düşünelim. Farklı türde dosyalar (örneğin, metin dosyası, görüntü dosyası) üzerinde çeşitli işlemler yapılabilir. Her dosya türü için farklı işlemler (örneğin, sıkıştırma, önizleme) uygulanabilir. Bu senaryoda, Visitor Design Pattern kullanılarak işlemler (ziyaretçiler) ve dosya türleri (elemanlar) birbirinden ayrılabilir.