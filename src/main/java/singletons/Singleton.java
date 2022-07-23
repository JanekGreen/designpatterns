package singletons;

public class Singleton {
    /*completely thread safe, guaranteed by Java Language specification*/
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void showMessage(){
        System.out.println("hello!");
    }
}
