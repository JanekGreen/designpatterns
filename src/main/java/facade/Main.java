package facade;

public class Main {
    public static void main(String[] args) {
        PackageSenderFacade facade = new PackageSenderFacade(new StorageService(), new PackagingService(), new TransferingManager());
        facade.sendPackage();
    }

    //Gdy robimy kilka akcji, które trzeba zawsze wykonać sekwencyjnie, możemy zastosować fasadę
    public void sendPackage() {
        StorageService storageService = new StorageService();
        //znalezienie paczki
        PackageOrder packageOrder = storageService.orderFindPackage();
        PackagingService packagingService = new PackagingService();
        //przygotowanie do wysyłki
        PackageOrder readyToSendPackage = packagingService.prepareForSending(packageOrder);
        TransferingManager transferingManager = new TransferingManager();
        //przekazanie do kierowcy
        transferingManager.orderPostalOfficeTransfer(readyToSendPackage);
    }

}
