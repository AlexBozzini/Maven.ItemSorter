package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item item1, Item item2) {
        if (item1.price < item2.price){
            return -1;
        } else if (item1.price > item2.price){
            return 1;
        }
        return 0;
    }
}
