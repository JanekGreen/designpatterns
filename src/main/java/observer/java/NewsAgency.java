package observer.java;

import java.util.Observable;

public class NewsAgency extends Observable {

    public void receiveNews(String news) {
        setChanged();
        notifyObservers(news);
    }


}
