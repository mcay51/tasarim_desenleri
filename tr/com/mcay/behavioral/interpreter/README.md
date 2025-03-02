### **Interpreter Design Pattern**

#### **Genel Bakış**
Interpreter Design Pattern, davranışsal (behavioral) tasarım desenlerinden biridir ve belirli bir dilin veya kuralların tanımlandığı, bu kurallara bağlı metinlerin veya ifadelerin işlenmesi gereken durumlarda kullanılır. Bu desen, bir dilin gramerini temsil eden sınıflar oluşturur ve bu grameri yorumlamak için bir "yorumlayıcı" sağlar.

---

#### **Kullanım Alanları**
- **Kurallı Metin İşleme:** Matematiksel ifadeler, mantıksal ifadeler veya dil gramerlerinin işlenmesi.
- **Kural İşletme Motorları (Rule Engines):** Özellikle iş kurallarını çalıştırmak için.
- **Programlama Dilleri ve Derleyiciler:** Basit dillerin yorumlanması veya gramerlerinin analiz edilmesi.
- **Sorgu İşleme:** SQL benzeri sorguların veya özel yapılandırılmış sorguların işlenmesi.
- **Metin Tabanlı Oyunlar:** Kullanıcı komutlarını yorumlama.

---

#### **Uygulama Adımları**
1. **Dil Gramerinin Tanımlanması:**
    - Çözülmesi gereken ifadelerin grameri oluşturulur.
2. **Abstract Expression (Soyut İfade):**
    - Yorumlanacak ifadeler için bir temel arayüz veya sınıf tanımlanır.
3. **Terminal Expression (Son İfade):**
    - Gramerin en temel bileşenlerini tanımlayan sınıf oluşturulur.
4. **Non-Terminal Expression (Ara İfade):**
    - Daha karmaşık ifadeleri tanımlayan ve terminal ifadeleri birleştiren sınıflar oluşturulur.
5. **Context (Bağlam):**
    - Yorumlama sırasında gerekli bilgilerin tutulduğu sınıf.
6. **Client (Müşteri):**
    - Yorumlama işlemini başlatan ve ifadeleri bir araya getiren sınıf.

---

#### **UML Diyagramı**

````mermaid
  classDiagram
      class AbstractExpression {
          <<interface>>
          +Interpret(context: Context): void
      }

      class TerminalExpression {
          +Interpret(context: Context): void
      }

      class NonTerminalExpression {
          +Interpret(context: Context): void
      }

      class Context {
          +input: string
          +output: string
      }

      AbstractExpression <|-- TerminalExpression
      AbstractExpression <|-- NonTerminalExpression
      TerminalExpression --> Context
      NonTerminalExpression --> Context
````

---

#### **Avantajlar**
- **Esneklik:** Gramerin kurallarını kod içerisinde kolayca tanımlayabilirsiniz.
- **Genişletilebilirlik:** Yeni gramer kuralları eklemek için yeni sınıflar eklemek yeterlidir.
- **Kuralları Merkezi Yönetim:** Gramer ve kurallar net bir şekilde tanımlanır.

---

#### **Dezavantajlar**
- **Performans Sorunları:** Karmaşık gramerlerde yorumlama işlemi yavaş olabilir.
- **Bakım Zorluğu:** Büyük ve karmaşık gramerlerde kodun bakımı zorlaşabilir.
- **Yüksek Sınıf Sayısı:** Her bir gramer kuralı için ayrı bir sınıf gerektiğinden, sınıf sayısı hızla artabilir.

---

Bu yapıyı genellikle basit bir dil veya gramer işlemek gerektiğinde kullanabilirsiniz. Ancak gramer çok karmaşık hale geldiğinde, diğer çözümler (örneğin, parser generator araçları) daha uygun olabilir.
````mermaid
classDiagram
    class Context {
        +Formula: String
        +TotalPoint: int
    }

    class RoleExpression {
        <<abstract>>
        +Interpret(context: Context): void
    }

    class ArchitectureExpression {
        +Interpret(context: Context): void
    }

    class ConsultantExpression {
        +Interpret(context: Context): void
    }

    class SeniorExpression {
        +Interpret(context: Context): void
    }

    class DeveloperExpression {
        +Interpret(context: Context): void
    }

    class Program {
        +CreateExpressionTree(formula: String): List~RoleExpression~
        +RunExpression(context: Context): void
    }

    RoleExpression <|-- ArchitectureExpression
    RoleExpression <|-- ConsultantExpression
    RoleExpression <|-- SeniorExpression
    RoleExpression <|-- DeveloperExpression
    Program --> RoleExpression : CreateExpressionTree()
    Program --> Context : RunExpression()
    RoleExpression --> Context : Interpret(context)
````
