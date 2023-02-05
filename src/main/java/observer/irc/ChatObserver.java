package observer.irc;

import observer.news.Observer;

public interface ChatObserver {
    void notifyUserLoggedIn(String userName);

}
