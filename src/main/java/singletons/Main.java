package singletons;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");
        Singleton.getInstance().showMessage();
        SingletonEnum.INSTANCE.showMessage();
    }
}
