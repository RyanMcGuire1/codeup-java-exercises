package jupitermart;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        Product MacBook = new Computers("bigSur", 2000, 1, true);
        Product iMac = new Computers("bigSur", 3000, 2, false);
        Product iPhone = new Phone("IOS",800, 3, 8);
        Product Galaxy = new Phone("android", 500, 4, 10);

        ArrayList<Product> shoppingCart = new ArrayList<>();
        shoppingCart.add(MacBook);
        shoppingCart.add(iMac);
        shoppingCart.add(iPhone);
        shoppingCart.add(Galaxy);

        Cashier Bob = new Cashier("Bob","Jones");
        System.out.println("Your cost is $" + Bob.totalPrice(shoppingCart));


    }
}
