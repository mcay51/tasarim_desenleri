package tr.com.mcay.creational.builder.clasic;

public class ArabaBuilder implements Builder {
    private Arac arac;
    
    public ArabaBuilder() {
        this.arac = new Arac();
    }
    
    @Override
    public void buildMotor() {
        arac.setMotor("2.0 Turbo Motor");
    }
    
    @Override
    public void buildKapilar() {
        arac.setKapilar(4);
    }
    
    @Override
    public void buildVitesler() {
        arac.setVitesler("Otomatik Vites");
    }
    
    @Override
    public Arac getArac() {
        return arac;
    }
} 