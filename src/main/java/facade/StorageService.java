package facade;

public class StorageService {
    public PackageOrder orderFindPackage(){
        System.out.println("Package found");
        return new PackageOrder("Package to send");
    }
}
