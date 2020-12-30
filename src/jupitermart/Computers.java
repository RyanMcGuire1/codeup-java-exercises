package jupitermart;

public class Computers extends Product {
    private boolean isLaptop;

    public Computers(String OS, double price, int id, boolean isLaptop ) {
        super(OS, price, id);
         this.isLaptop = true;
    }


    public boolean isLaptop() {
        return isLaptop;
    }
    public void setisLaptop(boolean laptop){
        this.isLaptop = laptop;
    }
}
