package springjpathymleaf.tuan3.Observer;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String status;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Not Started";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        notifySubscribers();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Task '" + taskName + "' status updated to: " + status);
        }
    }
}
