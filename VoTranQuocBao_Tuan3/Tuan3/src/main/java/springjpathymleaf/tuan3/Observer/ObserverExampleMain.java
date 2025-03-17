package springjpathymleaf.tuan3.Observer;

public class ObserverExampleMain {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.00);
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Emma");

        appleStock.addSubscriber(investor1);
        appleStock.addSubscriber(investor2);

        appleStock.setPrice(155.50); // Notify investors

        // Project Task Example
        Task task1 = new Task("Develop Login Feature");
        task1.addSubscriber(investor1);
        task1.addSubscriber(investor2);

        task1.updateStatus("In Progress"); // Notify project members
    }
}
