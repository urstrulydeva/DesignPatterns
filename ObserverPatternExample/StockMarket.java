package ObserverPatternExample;
import java.util.*;
public class StockMarket implements Stock{
    private List<Observer> observers;
    private String stockPrice;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
