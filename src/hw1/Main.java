package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import hw1.Domen.Bottle;
import hw1.Domen.HotDrink;
import hw1.Domen.Product;
import hw1.Services.CoinDispenser;
import hw1.Services.Display;
import hw1.Services.Holder;
import hw1.Services.VendingMachine;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        Product hotDrink = new HotDrink(80, 4, "Coffee", 23, 90);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(hotDrink);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        System.out.println(hotDrink);


//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();

    }
}