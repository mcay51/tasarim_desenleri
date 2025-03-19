package tr.com.mcay.behavioral.interpreter;

/**
 * ArchitectureExpression sınıfı, mimari rolünü temsil eden somut bir ifade sınıfıdır.
 * Context içindeki formülde "A" karakterini arar ve bulduğunda toplam puana 10 ekler.
 */
public class ArchitectureExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        String formula = context.getFormul();
        int count = 0;
        
        // Formül içinde "A" karakterlerini say
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println( "A : "+ count);
        System.out.println( "A toplam : "+ (count*10));
        // Her "A" için 10 puan ekle
        context.setToplamPuan(context.getToplamPuan() + (count * 10));
    }
} 