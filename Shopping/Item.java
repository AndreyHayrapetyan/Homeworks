package Shopping;

public abstract class Item {
    private int id;
    private ItemBrand brand;
    private double price;
    private static int idCounter = 1;

    public Item(ItemBrand brand, double price) {
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

    public double getPrice() {
        return price;
    }

    public ItemBrand getBrand() {
        return brand;
    }
}
