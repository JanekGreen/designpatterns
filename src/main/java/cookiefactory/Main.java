package cookiefactory;

public class Main {
    public static void main(String[] args) {
        CookieFactory cookieFactory = new CookieFactory();
        Cookie oreo = cookieFactory.createCookie("oreo");
        Cookie brownie = cookieFactory.createCookie("brownie");
        brownie.eat();
        oreo.eat();
        doSomethingWithThatCookie(brownie);
        doSomethingWithThatCookie(oreo);
    }

    private static boolean doSomethingWithThatCookie(Cookie cookie){
        return true;
    }
}
