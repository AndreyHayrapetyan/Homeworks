package Smartlight;

public class SmartLight {

    private boolean isOn;
    private int brightness;
    private String color;

    public SmartLight() {
        this.isOn = false;
        this.brightness = 50;
        this.color = "white";
    }


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }


    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        this.isOn = !this.isOn;
    }
}

