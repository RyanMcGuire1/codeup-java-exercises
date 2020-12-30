package jupitermart;

import java.util.List;

public class Cashier {
    private String firstName;
    private String lastName;
//    needs a method to ring up cart


    public Cashier(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double totalPrice(List<Product> shoppingcart){
        double cost = 0;
        for(Product item: shoppingcart){
            cost += item.getPrice();
        }
        return cost;
    }




}
