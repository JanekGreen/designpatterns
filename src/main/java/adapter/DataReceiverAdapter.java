package adapter;

public class DataReceiverAdapter implements Receiver{
   private DataReceiver dataReceiver;

    public DataReceiverAdapter(DataReceiver dataReceiver) {
    this.dataReceiver = dataReceiver;
    }

    @Override
    public String getData() {
        return dataReceiver.receive();
    }

}
