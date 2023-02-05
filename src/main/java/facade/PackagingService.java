package facade;

public class PackagingService {
    public PackageOrder prepareForSending(PackageOrder packageToSend){
        System.out.println("Prepared for sending");
       return packageToSend;
    }
}
