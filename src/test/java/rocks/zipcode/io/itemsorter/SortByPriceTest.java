package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1() {
        // given
        Item item1 = new Item(1L, "Dragonfruit", 3.5);
        Item item2 = new Item(2L, "Raisin Bagel", 1.8);
        Item item3 = new Item(3L, "Hummus", 2.7);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item2, item3, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> priceComparator = (Comparator<Item>) new PriceComparator();
        // when
        Item[] actual = itemSorter.sort(priceComparator);
        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        // given
        Item item1 = new Item(4L, "La Croix", 5.0);
        Item item2 = new Item(5L, "Cheez Its", 2.6);
        Item item3 = new Item(6L, "Cat Food", 15.3);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> priceComparator = (Comparator<Item>) new PriceComparator();
        // when
        Item[] actual = itemSorter.sort(priceComparator);
        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        // given
        Item item1 = new Item(7L, "Mangos", 4.2);
        Item item2 = new Item(8L, "Avocados", 6.1);
        Item item3 = new Item(9L, "Hoagie", 5.0);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item1, item3, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> priceComparator = (Comparator<Item>) new PriceComparator();
        // when
        Item[] actual = itemSorter.sort(priceComparator);
        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
