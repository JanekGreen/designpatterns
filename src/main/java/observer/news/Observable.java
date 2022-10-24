package observer.news;

public interface Observable {
   /*wołamy, gdy zmieni się stan: otrzymamy nowy news*/
   void notifyObservers();
   /*dodajemy do listy nowego obserwatora - nową stacje radiową*/
   void register(Observer observer);
   /*usuwamy z listy obserwatora*/
   void unregister(Observer observer);
}
