package generics.restrictions;

public class Main<T> {
    /*nie możemy Tworzyć statycznych pól w klasie które są generykami*/
 /*   private static T field;*/

    public static void main(String[] args) {
    }
    public static <T> void ex(){

        /*   T type = new T();
        T[]arr = new T[];*/
        /*nie możemy Tworzyć statycznych pól w klasie które są generykami*/
        /*nie można używać instanceof z typami generycznymi*/
        /* nie można zrobić tak: if(box2 instanceof Box<String>)*/

    }
}
