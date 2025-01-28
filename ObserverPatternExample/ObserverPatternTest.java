package ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("Rs.100");
        System.out.println("");

        stockMarket.setStockPrice("Rs.120");
        System.out.println("");

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice("Rs.140");
    }
}
