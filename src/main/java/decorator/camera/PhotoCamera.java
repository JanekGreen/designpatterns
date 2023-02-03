package decorator.camera;

public class PhotoCamera implements Camera {
    @Override
    public String takePhoto() {
       return  "Photo taken";
    }
}
