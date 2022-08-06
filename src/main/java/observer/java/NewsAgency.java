package observer.java;

import java.awt.Button;
import java.util.Observable;

public class NewsAgency extends Observable {

    public void receiveNews(String news) {
        /*trzeba wywołać setChanged żeby ustawić flagę na true. Oznacza zmianę stanu*/
        setChanged();
        notifyObservers(news);
    }


}
