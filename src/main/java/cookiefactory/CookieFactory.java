package cookiefactory;

public class CookieFactory {
    public Cookie createCookie(String type){
        if("brownie".equalsIgnoreCase(type)){
            return new Brownie();
        }
        if("oreo".equalsIgnoreCase(type)){
            return new Oreo();
        }
        return null;

    }
}
