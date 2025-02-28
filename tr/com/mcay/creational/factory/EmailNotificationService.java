package tr.com.mcay.creational.factory;

public class EmailNotificationService implements INotificationService{
    private String smtpServer;
    
    public EmailNotificationService(String smtpServer) {
        this.smtpServer = smtpServer;
    }
    
    @Override
    public void send(String message, String target) {
        System.out.println("E-posta gönderiliyor: " + message);
        System.out.println("Alıcı: " + target);
        System.out.println("SMTP Sunucu: " + smtpServer);
    }
}
