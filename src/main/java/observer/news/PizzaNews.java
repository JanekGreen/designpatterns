package observer.news;

public class PizzaNews implements Observer{
    @Override
    public String getName() {
        return "Pizza news";
    }

    @Override
    public void update(String data) {
        System.out.println("Not only pizza news at pizza news: "+ data);

    }
}
