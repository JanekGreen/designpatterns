package adapter;

//Adapter implementuje interfejs który pasuje, nasz stary interfejs
public class DataReceiverAdapter implements Receiver{
    private DataReceiver dataReceiver;


    //Przyjmuje w konstruktorze interfejs niepasujący, ten nowy
    public DataReceiverAdapter(DataReceiver dataReceiver) {
    this.dataReceiver = dataReceiver;
    }

    @Override
    public String getData() {
        //tłumaczycie jeden interfejs na drugi
        return dataReceiver.receive();
    }
}
