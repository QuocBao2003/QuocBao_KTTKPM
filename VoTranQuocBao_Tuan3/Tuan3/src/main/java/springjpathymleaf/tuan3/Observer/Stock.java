package springjpathymleaf.tuan3.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject{
    private String name;
    private double price;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Stock " + name + " has a new price: " + price);
        }
    }
}
