abstract class Device {
    String brand = "Samsung";

    abstract void turnOn();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

interface Camera {
    int MAX_ZOOM = 10;

    void takePhoto();

    default void cameraInfo() {
        System.out.println("Camera is ready");
    }
}

interface MusicPlayer {
    String TYPE = "Digital";

    default void play() {
        System.out.println("Playing music");
    }
}

public class Abstraction extends Device implements Camera, MusicPlayer {
    @Override
    void turnOn() {
        System.out.println("Smartphone is turned ON");
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo taken (max zoom: " + MAX_ZOOM + ")");
    }

    public static void main(String[] args) {
        Abstraction phone = new Abstraction();

        phone.showBrand();
        phone.turnOn();
        phone.cameraInfo();
        phone.takePhoto();
        phone.play();
    }
}
