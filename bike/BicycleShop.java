package bike;

import java.util.ArrayList;
import java.util.Collections;

public class BicycleShop {
    
    static ArrayList<Bicycle> stock;
    public static void main(String[] args) {
        stock = new ArrayList<Bicycle>();
        stock.add(new Bicycle(5, 20, 6, 110));
        stock.add(new Bicycle(2, 25, 3, 142));
        stock.add(new Bicycle(4, 5, 1, 128));

        for (Bicycle i : stock) {
            System.out.println(i);
        }

        Collections.sort(stock);
        for (Bicycle i : stock) {
            System.out.println(i);
        }

    }
}
