package tr.com.mcay.structural.bridge;

/**
 * RemoteControl - Bridge deseninin soyutlama (abstraction) kısmı
 */
public class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.powerOn();
    }

    public void turnOff() {
        tv.powerOff();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public void setVolume(int volume) {
        tv.setVolume(volume);
    }
} 