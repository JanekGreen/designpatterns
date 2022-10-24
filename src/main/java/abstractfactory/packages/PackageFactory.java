package abstractfactory.packages;

import abstractfactory.AbstractFactory;

public class PackageFactory implements AbstractFactory<Package> {
    @Override
    public Package create(String type) {
        if("sea".equalsIgnoreCase(type))
        return new SeaPackage();
        if("air".equalsIgnoreCase(type)){
            return new AirPackage();
        }
        return null;

    }
}
