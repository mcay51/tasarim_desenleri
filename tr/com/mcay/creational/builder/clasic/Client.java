package tr.com.mcay.creational.builder.clasic;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        
        // Araba üretimi
        ArabaBuilder arabaBuilder = new ArabaBuilder();
        Arac araba = director.aracUret(arabaBuilder);
        System.out.println("Araba üretildi: " + araba);
        
        // Motorsiklet üretimi
        MotorsikletBuilder motorsikletBuilder = new MotorsikletBuilder();
        Arac motorsiklet = director.aracUret(motorsikletBuilder);
        System.out.println("Motorsiklet üretildi: " + motorsiklet);
    }
} 