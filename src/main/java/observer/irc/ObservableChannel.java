package observer.irc;

import observer.news.Observer;

public interface ObservableChannel {
    void notifyObservers();
    /*dodajemy do listy nowego obserwatora - nową stacje radiową*/
    void register(ChatObserver observer);
    /*usuwamy z listy obserwatora*/
    void unregister(ChatObserver observer);


}
