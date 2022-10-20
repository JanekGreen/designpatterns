package builder;

import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(DogBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.toys = builder.toys;
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

    public static class DogBuilder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Dog.DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Dog.DogBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        public Dog.DogBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Dog.DogBuilder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }
        public Dog build(){
            return new Dog(this);
        }
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