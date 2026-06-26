public class Main {
    public static void main(String[] args) {
        // Instantiate the factory from the other file
        Factory factory = new Factory();
        
        // Use it to create objects
        Notification sms = factory.createNotification("SMS");
        sms.notifyUser();
        
        Notification email = factory.createNotification("EMAIL");
        email.notifyUser();
    }
}
