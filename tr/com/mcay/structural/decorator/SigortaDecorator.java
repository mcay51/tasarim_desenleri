package tr.com.mcay.structural.decorator;

/**
 * Sigorta kesintisini ekleyen somut decorator sınıfı
 */
public class SigortaDecorator extends MaasDecorator {
    private static final double SIGORTA_ORANI = 0.15; // %15 sigorta kesintisi
    
    /**
     * Sigorta decorator oluşturucu
     * @param maas sarmalanacak maaş nesnesi
     */
    public SigortaDecorator(IMaas maas) {
        super(maas);
    }
    
    @Override
    public double hesapla() {
        return super.hesapla() - (super.hesapla() * SIGORTA_ORANI);
    }
    
    @Override
    public String getAciklama() {
        return super.getAciklama() + " - Sigorta Kesintisi (%15)";
    }
} 