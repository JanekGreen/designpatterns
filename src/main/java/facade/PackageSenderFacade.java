package facade;

public class PackageSenderFacade {
   private final StorageService storageService;
   private final PackagingService packagingService;
   private final TransferingManager transferingManager;

    public PackageSenderFacade(StorageService storageService, PackagingService packagingService, TransferingManager transferingManager) {
        this.storageService = storageService;
        this.packagingService = packagingService;
        this.transferingManager = transferingManager;
    }

    public void sendPackage(){
        //znalezienie paczki
        PackageOrder packageOrder = storageService.orderFindPackage();
        //przygotowanie do wysyłki
        PackageOrder readyToSendPackage = packagingService.prepareForSending(packageOrder);
        //przekazanie do kierowcy
        transferingManager.orderPostalOfficeTransfer(readyToSendPackage);
    }
}
