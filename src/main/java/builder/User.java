package builder;

public class User {

    //All final attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private  String address; // optional

    private User(UserBuilder userBuilder){
        this.phone = userBuilder.phone;
        this.age = userBuilder.age;
        this.lastName = userBuilder.lastName;
        this.firstName = userBuilder.firstName;
        this.address = userBuilder.address;
    }

   public static class UserBuilder {
       private String firstName; // required
       private String lastName; // required
       private int age; // optional
       private String phone; // optional
       private  String address;

       public UserBuilder(String firstName, String lastName) {
           this.firstName = firstName;
           this.lastName = lastName;
       }
       public UserBuilder age(int age){
           this.age = age;
           return this;
       }
       public UserBuilder phone(String phone){
           this.phone = phone;
           return this;
       }
       public UserBuilder address(String address){
           this.address = address;
           return this;
       }
       public User build(){
          return  new User(this);
       }

   }

/*konwencja nazwaKlasyBuilder*/

    @Override
    public String toString() {
        return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address;
    }

    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

}