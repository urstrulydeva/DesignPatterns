package AdapterPatternExample;

public class PhonePeAdapter implements PaymentProcessor{
    private PhonePe phonePe;
    public PhonePeAdapter(PhonePe phonePe)
    {
        this.phonePe=phonePe;
    }
    @Override
    public void processPayment(double amount)
    {
        phonePe.sendPayment(amount);
    }
}
