package tr.com.mcay.structural.decorator;

/**
 * İkramiye ekleyen somut decorator sınıfı
 */
public class IkramiyeDecorator extends MaasDecorator {
    private double ikramiyeTutari;
    
    /**
     * İkramiye decorator oluşturucu
     * @param maas sarmalanacak maaş nesnesi
     * @param ikramiyeTutari eklenecek ikramiye tutarı
     */
    public IkramiyeDecorator(IMaas maas, double ikramiyeTutari) {
        super(maas);
        this.ikramiyeTutari = ikramiyeTutari;
    }
    
    @Override
    public double hesapla() {
        return super.hesapla() + ikramiyeTutari;
    }
    
    @Override
    public String getAciklama() {
        return super.getAciklama() + " + İkramiye";
    }
} 