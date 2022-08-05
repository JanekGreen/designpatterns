package adapter;

public class Main {

    public static void main(String[] args) {
        DataProcessingService dataProcessingService = new DataProcessingService();
        dataProcessingService.processData(new receiverImpl());
        //todo nowy interfejs do obsłużenia DataReceiver
        //dataProcessingService.processData(new DataReceiverImpl());


    }
}
