package observer;

import observer.irc.ChatObserver;
import observer.irc.IrcChannel;
import observer.irc.ObservableChannel;
import observer.irc.User;
import observer.news.NewsAgency;
import observer.news.Observer;
import observer.news.RadioStationOne;
import observer.news.TelevisionOne;
import observer.news.java.RadioXyz;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer televsion = new TelevisionOne();
        newsAgency.register(televsion);
        newsAgency.receiveNews("Unidentified object flying object seen over the white house!!!");
        Observer radio = new RadioStationOne();
        newsAgency.register(radio);
        //newsAgency.unregister(televsion);
        newsAgency.receiveNews("First contact with intelligent alien civilisation has been made!!!");

        Observer radioZyz = new RadioXyz();
        newsAgency.register(radioZyz);
        newsAgency.receiveNews("Pierwszy w polsce polityk powiedział prawde");

        IrcChannel ircChannel = new IrcChannel();
        ChatObserver user = new User();
        ircChannel.register(user);
        ircChannel.logIn("Janek");



    }
}
