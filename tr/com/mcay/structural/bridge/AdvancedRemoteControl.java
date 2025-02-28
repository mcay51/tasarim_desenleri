package tr.com.mcay.structural.bridge;

/**
 * AdvancedRemoteControl - RemoteControl sınıfını genişleten gelişmiş kumanda
 */
public class AdvancedRemoteControl extends RemoteControl {
    
    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }
    
    public void mute() {
        System.out.println("Ses kapatıldı");
        tv.setVolume(0);
    }
} 