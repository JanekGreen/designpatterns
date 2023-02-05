package adapter;

public class IntegerInterfaceAdapter implements Receiver{
    private IntegerInterface integerInterface;

    public IntegerInterfaceAdapter(IntegerInterface integerInterface) {
        this.integerInterface = integerInterface;
    }

    @Override
    public String getData() {
        return String.valueOf(integerInterface.receiveIntegerData());
    }
}
