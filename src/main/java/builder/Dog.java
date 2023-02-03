package builder;

import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;


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