package singletons;

public class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe INSTANCE;
    private SingletonLazyThreadSafe(){}

    /*Thread safe but slow a little bit, every time we enter the method we need to aquire a lock*/
    public synchronized static SingletonLazyThreadSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonLazyThreadSafe();
        }
        return INSTANCE;
    }
    public void showMessage(){
        System.out.println("hello!");
    }
}
