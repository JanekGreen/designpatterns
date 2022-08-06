package abstractfactory.sender;

public class PidgeonSend implements Send{

    @Override
    public void send() {
        System.out.println("Pidgeon sends the package");
    }

}
