package observer.news;
/*Observer - ktoś kto śledzi stan Obiektu Observable*/
public interface Observer {
    String getName();
    /*tudaj dostajemy stan, który obserwujemy*/
    void update(String data);

}
