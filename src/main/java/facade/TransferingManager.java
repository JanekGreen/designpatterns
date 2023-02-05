package facade;

public class TransferingManager {
    void orderPostalOfficeTransfer(PackageOrder packageOrder){
        System.out.println("Transferred to postal office: "+packageOrder.getName());
    }
}
