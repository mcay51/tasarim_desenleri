package tr.com.mcay.structural.bridge;

/**
 * Bridge tasarım desenini test eden demo sınıfı
 */
public class BridgeDemo {
    public static void main(String[] args) {
        // Samsung TV ile standart kumanda
        TV samsungTV = new SamsungTV();
        RemoteControl basicRemote = new RemoteControl(samsungTV);
        
        System.out.println("Samsung TV ile Standart Kumanda:");
        basicRemote.turnOn();
        basicRemote.setChannel(5);
        basicRemote.setVolume(15);
        basicRemote.turnOff();
        
        System.out.println("\n--------------------------\n");
        
        // LG TV ile gelişmiş kumanda
        TV lgTV = new LGTV();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(lgTV);
        
        System.out.println("LG TV ile Gelişmiş Kumanda:");
        advancedRemote.turnOn();
        advancedRemote.setChannel(10);
        advancedRemote.setVolume(20);
        advancedRemote.mute();
        advancedRemote.turnOff();
    }
} 