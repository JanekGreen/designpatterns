package singletons;

public class SingletonLazyThreadSafeTwo {
    private volatile static SingletonLazyThreadSafeTwo INSTANCE;
    private SingletonLazyThreadSafeTwo(){}

    /*Thread safe but slow a little bit, every time we enter the method we need to aquire a lock*/
    public static SingletonLazyThreadSafeTwo getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazyThreadSafeTwo.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonLazyThreadSafeTwo();
                }
            }
        }
        return INSTANCE;
    }
    public void showMessage(){
        System.out.println("hello!");
    }
}
