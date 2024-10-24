package Smartlight;

public class Main {
    public static void main(String[] args) {

        SmartLight myLight = new SmartLight();
        RemoteControl remote = new RemoteControl(myLight);

        myLight.toggle();
        System.out.println("Light is on: " + myLight.isOn());

        remote.changeBrightness(100);
        System.out.println("Brightness: " + myLight.getBrightness());

        remote.resetLight();
        System.out.println("Light is on: " + myLight.isOn() + ", Brightness: " + myLight.getBrightness() + ", Color: " + myLight.getColor());

        SmartLight status = remote.getLightStatus();
        System.out.println("Current Light Status - On: " + status.isOn() + ", Brightness: " + status.getBrightness() + ", Color: " + status.getColor());
    }
}

