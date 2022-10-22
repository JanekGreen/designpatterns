package decorator.camera;

public class PhotoCamera implements Camera {
    @Override
    public void takePhoto() {
        System.out.println("Photo taken");
    }
}
