package singletons;

import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
