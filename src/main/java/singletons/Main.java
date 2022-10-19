package singletons;

public class Main {

    public static void main(String[] args) {
   SingletonLazy.getInstance().addPetName("Puszek");
   SingletonLazy.getInstance().addPetName("Burek");

   SingletonLazy.getInstance().printNames();
    }
}
