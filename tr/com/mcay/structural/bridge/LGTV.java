package tr.com.mcay.structural.bridge;

/**
 * LGTV - TV arayüzünün somut implementasyonu
 */
public class LGTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("LG TV açılıyor...");
    }

    @Override
    public void powerOff() {
        System.out.println("LG TV kapanıyor...");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("LG TV kanal " + channel + " ayarlandı");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("LG TV ses seviyesi " + volume + " olarak ayarlandı");
    }
} 