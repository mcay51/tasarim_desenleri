package tr.com.mcay.creational.factoryabstract;

/**
 * Abstract Factory tasarım desenini test eden ana sınıf
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Tasarım Deseni Örneği\n");

        // Acil bildirim fabrikası ile test
        System.out.println("Acil Bildirimler:");
        INotificationFactory acilFactory = new AcilNotificationFactory();
        NotificationClient acilClient = new NotificationClient(acilFactory);
        acilClient.sendNotifications();

        System.out.println("\n------------------------\n");

        // Standart bildirim fabrikası ile test
        System.out.println("Standart Bildirimler:");
        INotificationFactory standardFactory = new StandardNotificationFactory();
        NotificationClient standardClient = new NotificationClient(standardFactory);
        standardClient.sendNotifications();
    }
} 