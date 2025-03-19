package tr.com.mcay.behavioral.interpreter;

/**
 * DeveloperExpression sınıfı, geliştirici rolünü temsil eden somut bir ifade sınıfıdır.
 * Context içindeki formülde "D" karakterini arar ve bulduğunda toplam puana 4 ekler.
 */
public class DeveloperExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        String formula = context.getFormul();
        int count = 0;
        
        // Formül içinde "D" karakterlerini say
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'D') {
                count++;
            }
        }
        System.out.println( "D : "+ count);
        System.out.println( "D toplam : "+ (count*4));
        // Her "D" için 4 puan ekle
        context.setToplamPuan(context.getToplamPuan() + (count * 4));
    }
} 