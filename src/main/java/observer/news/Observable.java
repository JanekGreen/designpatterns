package observer.news;

public interface Observable {
   void notifyObservers();
   void register(Observer observer);
   void unregister(Observer observer);
}
