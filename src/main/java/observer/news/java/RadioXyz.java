package observer.news.java;

import observer.news.Observer;

public class RadioXyz implements Observer {
    @Override
    public String getName() {
        return "Radio Zyz";
    }

    @Override
    public void update(String data) {
        System.out.println("Radio Zyz latest news: "+ data);
    }
}
