package tr.com.mcay.creational.builder.clasic;

public class Director {
    public Arac aracUret(Builder builder) {
        builder.buildMotor();
        builder.buildKapilar();
        builder.buildVitesler();
        return builder.getArac();
    }
} 