package tr.com.mcay.creational.builder.clasic;

public class Arac {
    private String motor;
    private int kapilar;
    private String vitesler;
    
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }
    
    public void setVitesler(String vitesler) {
        this.vitesler = vitesler;
    }
    
    @Override
    public String toString() {
        return "Arac [motor=" + motor + ", kapilar=" + kapilar + ", vitesler=" + vitesler + "]";
    }
} 