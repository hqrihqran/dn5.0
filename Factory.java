// The Interface
interface Notification {
    void notifyUser();
}

// Concrete Class 1
class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification.");
    }
}

// Concrete Class 2
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification.");
    }
}

// The Creator/Factory Class (Must match the filename Factory.java)
public class Factory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        if ("SMS".equalsIgnoreCase(channel)) {
            return new SMSNotification();
        } else if ("EMAIL".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        }
        throw new IllegalArgumentException("Unknown channel: " + channel);
    }
}
