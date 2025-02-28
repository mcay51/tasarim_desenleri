package tr.com.mcay.structural.decorator;

/**
 * Mesai ücretini ekleyen somut decorator sınıfı
 */
public class MesaiDecorator extends MaasDecorator {
    private int saat;
    private double saatUcreti;
    
    /**
     * Mesai decorator oluşturucu
     * @param maas sarmalanacak maaş nesnesi
     * @param saat mesai saati
     * @param saatUcreti saat başı ücret
     */
    public MesaiDecorator(IMaas maas, int saat, double saatUcreti) {
        super(maas);
        this.saat = saat;
        this.saatUcreti = saatUcreti;
    }
    
    @Override
    public double hesapla() {
        return super.hesapla() + (saat * saatUcreti);
    }
    
    @Override
    public String getAciklama() {
        return super.getAciklama() + " + Mesai Ücreti (" + saat + " saat)";
    }
} 