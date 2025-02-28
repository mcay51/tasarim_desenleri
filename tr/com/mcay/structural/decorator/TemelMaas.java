package tr.com.mcay.structural.decorator;

/**
 * Temel maaş sınıfı - Decorator deseninde temel bileşen
 */
public class TemelMaas implements IMaas {
    private double tabanMaas;
    
    /**
     * Temel maaş oluşturucu
     * @param tabanMaas taban maaş tutarı
     */
    public TemelMaas(double tabanMaas) {
        this.tabanMaas = tabanMaas;
    }
    
    @Override
    public double hesapla() {
        return tabanMaas;
    }
    
    @Override
    public String getAciklama() {
        return "Taban Maaş";
    }
} 