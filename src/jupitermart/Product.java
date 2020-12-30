package jupitermart;

public class Product {
    private String OS;
    private double price;
    private int id;

    public Product(String OS, double price, int id) {
        this.OS = OS;
        this.price = price;
        this.id = id;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
