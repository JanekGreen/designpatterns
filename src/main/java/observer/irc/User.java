package observer.irc;

/*observer*/
public class User implements ChatObserver  {

    @Override
    public void notifyUserLoggedIn(String userName) {
        System.out.println("Hey, user: "+userName+" has just logged in");
    }
}
