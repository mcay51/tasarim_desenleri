package tr.com.mcay.behavioral.interpreter;

/**
 * SeniorExpression sınıfı, kıdemli geliştirici rolünü temsil eden somut bir ifade sınıfıdır.
 * Context içindeki formülde "S" karakterini arar ve bulduğunda toplam puana 6 ekler.
 */
public class SeniorExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        String formula = context.getFormul();
        int count = 0;
        
        // Formül içinde "S" karakterlerini say
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'S') {
                count++;
            }
        }
        
        // Her "S" için 6 puan ekle
        context.setToplamPuan(context.getToplamPuan() + (count * 6));
    }
} 