package builder;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;


    private Dog(DogBuilder dogBuilder){
        this.age = dogBuilder.age;
        this.type = dogBuilder.type;
        this.name = dogBuilder.name;
        this.toys = dogBuilder.toys;
        this.toys = new ArrayList<>(dogBuilder.toys);
    }
    public static class DogBuilder{
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;


        public DogBuilder(String name) {
            this.name = name;
        }
        public DogBuilder type(String type){
            this.type = type;
            return this;
        }
        public DogBuilder age(int age){
            this.age = age;
            return this;
        }
        public DogBuilder toys(List<String> toys){
            this.toys = toys;
            return this;
        }

        public Dog build(){
            return new Dog(this);
        }

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getToys() {
        return toys;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }
}