package tr.com.mcay.creational.builder.clasic;

public class MotorsikletBuilder implements Builder {
    private Arac arac;
    
    public MotorsikletBuilder() {
        this.arac = new Arac();
    }
    
    @Override
    public void buildMotor() {
        arac.setMotor("650cc Motor");
    }
    
    @Override
    public void buildKapilar() {
        arac.setKapilar(0);
    }
    
    @Override
    public void buildVitesler() {
        arac.setVitesler("Manuel Vites");
    }
    
    @Override
    public Arac getArac() {
        return arac;
    }
} 