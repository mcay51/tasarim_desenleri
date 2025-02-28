package tr.com.mcay.structural.bridge;

/**
 * SamsungTV - TV arayüzünün somut implementasyonu
 */
public class SamsungTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("Samsung TV açılıyor...");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung TV kapanıyor...");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Samsung TV kanal " + channel + " ayarlandı");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Samsung TV ses seviyesi " + volume + " olarak ayarlandı");
    }
} 