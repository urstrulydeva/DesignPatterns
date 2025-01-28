package DecoratorPatternExample;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier= new EmailNotifier();
        emailNotifier.send("Hello via mail");
        Notifier smsAndEmailNotifier= new SMSNotifier(new EmailNotifier());
        smsAndEmailNotifier.send("Hello via SMS and mail");
    }
}
