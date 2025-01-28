package DecoratorPatternExample;

public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier wrapped)
    {
        super(wrapped);
    }
    @Override
    public void send(String message)
    {
        super.send(message);
        sendSMS(message);
    }
    private void sendSMS(String message)
    {
        System.out.println("Sending SMS with message: "+message);
    }
}
