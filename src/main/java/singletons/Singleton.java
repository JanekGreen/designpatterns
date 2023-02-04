package singletons;

public class Singleton {
    /*bezpieczny dla wątków, ale musimy się liczyć z tym, że jest tworzony podczas startu aplikacji
    * Od razu zajmuje pamięć*/
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void showMessage(){
        System.out.println("hello!");
    }
}
