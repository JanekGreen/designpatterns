package singletons;

import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private String data;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        /*
          W aplikacji wielowątkowej gdy kilka wątków zawoła getInstance w tym samym czasie może zostać stworzonych kilka singletonów
         Nie uzywamy w aplikacji wielowątkowej
         */
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
