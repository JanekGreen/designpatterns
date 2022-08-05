package observer.java;

import java.util.Observable;
import java.util.Observer;

public class TelevisionOne implements Observer {

    @Override
    public void update(Observable o, Object news) {
        System.out.println("***Television one Breaking news "+ news);
    }

}
