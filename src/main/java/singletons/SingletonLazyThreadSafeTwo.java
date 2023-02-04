package singletons;

public class SingletonLazyThreadSafeTwo {
    private volatile static SingletonLazyThreadSafeTwo INSTANCE;
    private SingletonLazyThreadSafeTwo(){}

    /*Można znaleźć rzadkie bugi w internecie, ale ogólnie bezpieczny dla wątków*/
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
