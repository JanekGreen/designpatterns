package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private String data;

    public void receiveNews(String news) {
        this.data = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers
                .forEach(o -> o.update(data));
    }

    @Override
    public void register(Observer observer) {
        System.out.println("registered new observer " + observer.getName());
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Unregistered new observer " + observer.getName());
        observers.remove(observer);
    }

}
