package singletons;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        /*
          no thread safety here. can you say why, and how to fix it?
         */
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
    public void showMessage(){
        System.out.println("hello!");
    }
}
