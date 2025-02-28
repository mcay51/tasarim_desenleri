package tr.com.mcay.structural.bridge;

/**
 * TV arayüzü - Bridge deseninin implementor kısmı
 */
public interface TV {
    void powerOn();
    void powerOff();
    void tuneChannel(int channel);
    void setVolume(int volume);
} 