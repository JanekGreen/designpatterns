package observer.irc;

public interface ObservableChannel {
    void register(ChatObserver observer);
    void unregister(ChatObserver observer);

    void notifyObservers();

}
