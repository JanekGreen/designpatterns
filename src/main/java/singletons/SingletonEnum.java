package singletons;

enum SingletonEnum {
    /*thread safe*/
    INSTANCE;
    public void showMessage(){
        System.out.println("Hello from singletons.Singleton enum");
    }
}
