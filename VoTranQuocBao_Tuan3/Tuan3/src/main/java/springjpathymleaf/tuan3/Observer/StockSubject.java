package springjpathymleaf.tuan3.Observer;

public interface StockSubject {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
