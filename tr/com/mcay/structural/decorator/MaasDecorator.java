package tr.com.mcay.structural.decorator;

/**
 * Soyut Decorator sınıfı - Tüm decorator'ların temel sınıfı
 */
public abstract class MaasDecorator implements IMaas {
    // Sarmalanan maaş nesnesi
    protected IMaas maas;
    
    /**
     * Decorator oluşturucu
     * @param maas sarmalanacak maaş nesnesi
     */
    public MaasDecorator(IMaas maas) {
        this.maas = maas;
    }
    
    @Override
    public double hesapla() {
        return maas.hesapla();
    }
    
    @Override
    public String getAciklama() {
        return maas.getAciklama();
    }
} 