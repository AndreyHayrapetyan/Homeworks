package Smartlight;

public class  RemoteControl {
    private SmartLight smartLight;


    public RemoteControl(SmartLight smartLight) {
        this.smartLight = smartLight;
    }


    public void resetLight() {
        smartLight.setOn(false);
        smartLight.setBrightness(50);
        smartLight.setColor("white");
    }


    public SmartLight getLightStatus() {
        return smartLight;
    }

    public void changeBrightness(int brightness) {
        smartLight.setBrightness(brightness);
    }
}

