package AdapterPatternExample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        GPay gPay=new GPay();
        PhonePe phonePe= new PhonePe();
        gPay.sendPayment(85.00);
        phonePe.sendPayment(78.00);
    }
}
