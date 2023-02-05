package observer;

import observer.irc.ChatObserver;
import observer.irc.IrcChannel;
import observer.irc.ObservableChannel;
import observer.irc.User;
import observer.news.*;
import observer.news.java.RadioXyz;

public class Main {

    public static void main(String[] args) {
/*        NewsAgency newsAgency = new NewsAgency(); // agencja prasowa, wszyscy chcą ją obserwować w oczekiwaniu na newsy
        Observer televsion = new TelevisionOne();
        newsAgency.register(televsion);
        newsAgency.receiveNews("Unidentified object flying object seen over the white house!!!");
        Observer radio = new RadioStationOne();
        newsAgency.register(radio);
        newsAgency.unregister(televsion);
        newsAgency.receiveNews("First contact with intelligent alien civilisation has been made!!!");

        Observer radioZyz = new RadioXyz();
        newsAgency.register(radioZyz);
        newsAgency.receiveNews("Pierwszy w polsce polityk powiedział prawde");
        Observer pizzaNews = new PizzaNews();
        newsAgency.register(pizzaNews);
        newsAgency.receiveNews("First personal quantum computer on sale");*/

        IrcChannel observableChannel = new IrcChannel();
        ChatObserver observerOne = new User("Heniu");
        observableChannel.register(observerOne);
        User user = new User("Mitnick");
        observableChannel.userLogonEvent("Mitnick");




    }
}
