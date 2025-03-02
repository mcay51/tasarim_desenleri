package tr.com.mcay.behavioral.interpreter;

/**
 * ConsultantExpression sınıfı, danışman rolünü temsil eden somut bir ifade sınıfıdır.
 * Context içindeki formülde "C" karakterini arar ve bulduğunda toplam puana 8 ekler.
 */
public class ConsultantExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        String formula = context.getFormul();
        int count = 0;
        
        // Formül içinde "C" karakterlerini say
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'C') {
                count++;
            }
        }
        
        // Her "C" için 8 puan ekle
        context.setToplamPuan(context.getToplamPuan() + (count * 8));
    }
} 