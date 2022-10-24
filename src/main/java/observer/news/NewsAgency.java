package observer.news;

import java.util.ArrayList;
import java.util.List;
/*Observable - obiekt którego stan chcemy obserwować*/
public class NewsAgency implements Observable {
/*Wszyscy observers są na tej liście*/
    private final List<Observer> observers = new ArrayList<>();
    private String data;

    public void receiveNews(String news) {
        this.data = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
       /* observers
                .forEach(o -> o.update(data));*/

        for (Observer observer : observers){
            observer.update(this.data);
        }
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
