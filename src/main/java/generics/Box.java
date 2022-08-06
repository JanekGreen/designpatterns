package generics;

public class Box<T> {
    T item;

    public T getItem() {
        return item;
    }

    public void  setItem(T item) {
        this.item = item;
    }
    /*typ generyczny niezdefiniowany w klasie, robimy tak jak w przypadku metod*/
    public static <V> void example(V input){
    }
    public static String example(String input){
        return "test";
    }

}
