package observer.irc;

import observer.news.Observer;

import java.util.ArrayList;
import java.util.List;

/*Klasa którą obserwują użytkownicy*/
public class IrcChannel implements ObservableChannel {
    private List<ChatObserver> users = new ArrayList<>();
    private String latestUser;

    public void userLogonEvent(String username){
        latestUser = username;
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (ChatObserver observer: users){
            observer.notifyUserLoggedIn(latestUser);
        }
    }

    @Override
    public void register(ChatObserver observer) {
        System.out.println("new Observer registered");
        users.add(observer);
    }

    @Override
    public void unregister(ChatObserver observer) {
        System.out.println("new Observer unregistered");
        users.remove(observer);
    }
}
