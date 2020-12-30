package jupitermart;

public class Phone extends Product {
    private double screenSize;

    public Phone(String OS, double price, int id, double screenSize) {
        super(OS, price, id);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
