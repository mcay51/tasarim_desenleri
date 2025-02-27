package tr.com.mcay.creational.builder.clasic;

public interface Builder {
    void buildMotor();
    void buildKapilar();
    void buildVitesler();
    Arac getArac();
} 