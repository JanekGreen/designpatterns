package adapter;

public class Main {

    public static void main(String[] args) {
        DataProcessingService dataProcessingService = new DataProcessingService();
        dataProcessingService.processData(new receiverImpl());
        dataProcessingService.processData(new DataReceiverAdapter(new DataReceiverImpl()));
        //niepasujący interfejs/klasa
        //dataProcessingService.processData(new DataReceiverAdapter(new DataReceiverImpl()));
        //Proszę dodać adapter który pozwoli na obsłużenie DataReceiverNewImpl w DataProcessingService
        //dataProcessingService.processData(...(new DataReceiverNewImpl()));



    }
}
