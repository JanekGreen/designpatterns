package adapter;

public class DataProcessingService {
    public boolean processData(Receiver receiver){
        System.out.printf("processing %s \n", receiver.getData());
        return receiver.getData() != null;
    }
}
