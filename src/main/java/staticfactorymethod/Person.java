package staticfactorymethod;

public class Person {
    private String name;
    private String surname;

    private Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static Person personOfName(String name){
        return new Person(name, null);
    }

    public static Person personOfSurname(String surname){
        return new Person(null, surname);
    }

    public static Person personOf(String name , String surname){
        return new Person(name, surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
