package tr.com.mcay.behavioral.interpreter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Program sınıfı, yorumlayıcı deseninin istemci sınıfıdır.
 * İfade ağacını oluşturur ve çalıştırır.
 */
public class Program {
    /**
     * Verilen formüle göre ifade ağacını oluşturur.
     * @param formula İfade ağacını oluşturmak için kullanılacak formül
     * @return İfade ağacını temsil eden RoleExpression listesi
     */
    public Set<RoleExpression> createExpressionTree(String formula) {
        // Önce tüm ifade nesnelerini bir kez oluştur
        ArchitectureExpression architectureExpression = new ArchitectureExpression();
        ConsultantExpression consultantExpression = new ConsultantExpression();
        SeniorExpression seniorExpression = new SeniorExpression();
        DeveloperExpression developerExpression = new DeveloperExpression();

        Set<RoleExpression> expressionTree = new HashSet<>();

// Formülde kullanılan her karakter için ilgili ifade nesnesini ekle
        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);
            switch (c) {
                case 'A':
                    expressionTree.add(architectureExpression);
                    break;
                case 'C':
                    expressionTree.add(consultantExpression);
                    break;
                case 'S':
                    expressionTree.add(seniorExpression);
                    break;
                case 'D':
                    expressionTree.add(developerExpression);
                    break;
                default:
                    // Tanınmayan karakterler için hiçbir şey yapma
                    break;
            }
        }

        return expressionTree;
    }
    
    /**
     * Oluşturulan ifade ağacını çalıştırır ve sonucu hesaplar.
     * @param context Yorumlanacak bağlam nesnesi
     */
    public void runExpression(Context context) {
        Set<RoleExpression> expressionTree = createExpressionTree(context.getFormul());
        
        // Her ifadeyi yorumla
        for (RoleExpression expression : expressionTree) {
            expression.interpret(context);
        }
    }
    
    /**
     * Ana metod, örnek bir formül ile yorumlayıcı desenini test eder.
     * @param args Komut satırı argümanları
     */
    public static void main(String[] args) {
       // Örnek bir formül: "ACSDD" (1 Mimar, 1 Danışman, 1 Kıdemli, 2 Geliştirici)
        String formula = "ACSDD";
        Context context = new Context(formula);
        
        Program program = new Program();
         program.runExpression(context);
        
        System.out.println("Formül: " + formula);
        System.out.println("Toplam Puan: " + context.getToplamPuan());
        
       // Başka bir örnek: "AACSSDDD"
        formula = "AACSSDDD";
        context = new Context(formula);
        
        program.runExpression(context);
        
        System.out.println("\nFormül: " + formula);
        System.out.println("Toplam Puan: " + context.getToplamPuan());
    }
} 