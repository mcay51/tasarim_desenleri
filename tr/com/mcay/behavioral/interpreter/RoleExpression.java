package tr.com.mcay.behavioral.interpreter;

/**
 * RoleExpression sınıfı, yorumlayıcı deseninin soyut ifade sınıfıdır.
 * Tüm somut ifade sınıfları bu sınıfı miras alır ve interpret metodunu uygular.
 */
public abstract class RoleExpression {
    /**
     * Context nesnesini yorumlayarak işlem yapar.
     * @param context Yorumlanacak bağlam nesnesi
     */
    public abstract void interpret(Context context);
} 