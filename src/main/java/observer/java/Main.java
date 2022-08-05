package observer.java;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer televisionOne = new TelevisionOne();
        newsAgency.addObserver(televisionOne);
        newsAgency.receiveNews("100 days of Zombie apocalypse behind us!!!");
        /*Proste, ale jest deprecated od Javy 9  bo ma trochę wad*/
        /*Observable to nie jest interface tylko klasa abstrakcyjna*/
        /*Można nadpisać metody synchronized, wtedy, gdy zrobi się to nieumiejętnie observer przestaje być Thread safe*/
    }
}
