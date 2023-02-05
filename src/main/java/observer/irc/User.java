package observer.irc;

/*observer*/
/*Obserwujący kanał*/
public class User implements ChatObserver{
    String user;

    public User(String user) {
        this.user = user;
    }

    @Override
    public void notifyUserLoggedIn(String userName) {
        System.out.println("Hi "+user +" new Username "+ userName+" has just logged in");
    }
}
