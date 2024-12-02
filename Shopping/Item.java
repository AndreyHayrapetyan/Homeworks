package Shopping;

import java.util.Arrays;

public abstract class Item {
    private int id;
    private String brand;
    private double price;
    private int idCounter = 1;

    public Item(String brand, double price) {
        this.id = idCounter++;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice(){
        return price;
    }

    public String getBrand() {
        return brand;
    }
}

