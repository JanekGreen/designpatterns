package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
       Object object = Integer.valueOf(6);
       String str = (String) object;
        System.out.println(str);

        Box<Integer>  box  = new Box<>();
        box.setItem(1);
        Integer item = box.getItem();
        Box<String> box2 = new Box<>();
        box2.setItem("aaaaaaaaaa");
        box2.setItem("");
        Box2 ex = new Box2();
        ex.setItem("aaaa");
       Integer t = (Integer) ex.getItem();
       Integer res = 2+t;
       ParametrizedInterface<String> strRet = new StringReturner();
       strRet.getValue();
       /*można przypisać parentowi dowolny podtyp*/

       /*Lista integerów to nie jest podtyp Listy Numberów*/
       List<Integer> child = new ArrayList<>();
       List<Number> numList = new ArrayList<>();

       //numList = child;
          List<Integer> nums = Arrays.asList(1,5,7,4);
        List<Number>  numbers = new ArrayList<>();
        List<Number> ages = new ArrayList<>();

        storeNumbers(nums);

        Integer n = Integer.valueOf(6);
        Number parent = n;

        numbers.add(11);
        numbers.add(11.2D);





        /*Type erasure*/
        /*wszystkie typy generyczne użyte przez nas  po kompilacji zostaną zamienione na Object*/

        /* nie można zrobić tak: if(box2 instanceof Box<String>)*/

    }
    /*? extends number przyjmuje dowolny podtyp Klasy number*/
    public static List<Number> multiplyNumbers(List<? extends Number> nums){
        return nums.stream()
                .map(n -> n.intValue() * 2)
                .collect(Collectors.toList());
    }
    /*Ograniczenie z dołu, przyjmujemy wszystkie typy, które są parentem Integer*/
    /*pasują List<Number> List<Object> List<Integer>*/
    public static void storeNumbers(List<? super Integer> nums){
       /* IntStream.rangeClosed(1,10)
                .forEach(nums::add);*/

        for (int i=1; i<=10;i++){
            nums.add(i);
        }
       return;
    }
    /*Nie obchodzi nas konkretny typ*/
    /*tutaj interesuje nas, że mamy listę,*/
    /*używamy też, gdy chcemy skorzystać z metod klasy Object*/
    /*równoznaczne z List<Object> ale źle wygląda użycie List<Object>*/
    public static void printForElement(List<?> list){
    }

   /* *//*metoda sparametryzowana typem generycznym*//*
    public static <T> T testMethod(T input){

    }
    *//*Przykład z dwoma typami generycznymi Przyjmujemy input o typie T zwracamy Liste z obiektami V*//*
    public static <T, V> List<V> testMethod2(T input){

    }
    *//*Przykład z dwoma typami generycznymi Przyjmujemy input o typie T zwracamy Obiekt V*//*
    public static <T, V> V testMethod2(T input){

    }*/
/*   public static <T, V> List<V> testMethod2(T input){

   }*/

}
