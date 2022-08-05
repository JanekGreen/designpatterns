package observer;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer televsion = new TelevisionOne();
        newsAgency.register(televsion);
        newsAgency.receiveNews("Unidentified object flying object seen over the white house!!!");
        Observer radio = new RadioStationOne();
        newsAgency.register(radio);
        newsAgency.receiveNews("First contact with intelligent alien civilisation has been made!!!");

    }
}
