package singletons;

import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private List<String> names = new ArrayList<>();
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
    public void addPetName(String name){
        names.add(name);
    }
    public void printNames(){
        names.stream()
                .forEach(System.out::println);

        names.stream()
                .forEach(name -> System.out.println(name));
    }
   
}
