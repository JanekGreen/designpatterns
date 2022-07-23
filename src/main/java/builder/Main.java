package builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Ada", "Lovelace")
                .age(12)
                .phone("0700880770")
                .build();
        System.out.println(user);
    }


}
