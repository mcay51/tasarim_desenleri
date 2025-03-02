package tr.com.mcay.behavioral.interpreter;

/**
 * Context sınıfı, yorumlanacak formülü ve toplam puanı tutar.
 * Interpreter deseni içinde yorumlanacak bilgileri içerir.
 */
public class Context {
    private String formul;
    private int toplamPuan;

    public Context(String formul) {
        this.formul = formul;
        this.toplamPuan = 0;
    }

    public String getFormul() {
        return formul;
    }

    public void setFormul(String formul) {
        this.formul = formul;
    }

    public int getToplamPuan() {
        return toplamPuan;
    }

    public void setToplamPuan(int toplamPuan) {
        this.toplamPuan = toplamPuan;
    }
} 