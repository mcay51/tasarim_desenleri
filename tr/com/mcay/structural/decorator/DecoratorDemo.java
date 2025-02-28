package tr.com.mcay.structural.decorator;

/**
 * Decorator tasarım deseninin kullanımını gösteren demo sınıfı
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        // Temel maaş oluştur (10000 TL)
        IMaas temelMaas = new TemelMaas(10000);
        System.out.println("Temel Maaş: " + temelMaas.getAciklama() + " = " + temelMaas.hesapla() + " TL");
        
        // Mesai eklenmiş maaş
        IMaas mesailiMaas = new MesaiDecorator(temelMaas, 20, 50); // 20 saat, saat başı 50 TL
        System.out.println("Mesaili Maaş: " + mesailiMaas.getAciklama() + " = " + mesailiMaas.hesapla() + " TL");
        
        // Mesai ve ikramiye eklenmiş maaş
        IMaas ikramiyeliMaas = new IkramiyeDecorator(mesailiMaas, 2000); // 2000 TL ikramiye
        System.out.println("İkramiyeli Maaş: " + ikramiyeliMaas.getAciklama() + " = " + ikramiyeliMaas.hesapla() + " TL");
        
        // Mesai, ikramiye ve sigorta kesintisi eklenmiş maaş
        IMaas sigortaliMaas = new SigortaDecorator(ikramiyeliMaas);
        System.out.println("Sigortalı Maaş: " + sigortaliMaas.getAciklama() + " = " + sigortaliMaas.hesapla() + " TL");
        
        // Farklı bir kombinasyon: Sadece temel maaş ve sigorta
        IMaas sadeceSigortaliMaas = new SigortaDecorator(temelMaas);
        System.out.println("Sadece Sigortalı Maaş: " + sadeceSigortaliMaas.getAciklama() + " = " + sadeceSigortaliMaas.hesapla() + " TL");
        
        // Farklı bir kombinasyon: Temel maaş, ikramiye ve sigorta (mesai yok)
        IMaas ikramiyeVeSigortaliMaas = new SigortaDecorator(new IkramiyeDecorator(temelMaas, 2000));
        System.out.println("İkramiye ve Sigortalı Maaş: " + ikramiyeVeSigortaliMaas.getAciklama() + " = " + ikramiyeVeSigortaliMaas.hesapla() + " TL");

        System.out.println("Tek satırda hesaplama ");
        IMaas ikramiyeliMaas2=new IkramiyeDecorator(new MesaiDecorator(new TemelMaas(10000),20,50),2000);

        System.out.println("İkramiyeli Maaş : "+ikramiyeliMaas2.getAciklama()+" = "+ikramiyeliMaas2.hesapla()+" TL");
    }
} 