package main.java.com.academy.stock;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StockList {

    private final Map<String, StockItem> stockList;

    public StockList() {
        this.stockList = new TreeMap<>();
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(stockList);
    }

    public StockItem getItem(String itemName) {
        return stockList.get(itemName.trim());
    }

    /**
     * Add a new stock item to the existing list.
     * @param item - New Stock Item to be added.
     * @return - Returns the available quantity in stock for the specified Stock Item,
     *          if the item is successfully added. Else, returns -1.
     */
    public int addStock(StockItem item) {
        if (item == null) {
            return -1;
        }
        if ((item.getUnitPrice() <= 0) || (item.getQuantityInStock() < 0)) {
            return -1;
        }

        StockItem existingItem = this.stockList.getOrDefault(item.getName(), item);
        if (existingItem != item) {
            existingItem.adjustStockLevel(item.getQuantityInStock());
        }
        this.stockList.put(existingItem.getName(), existingItem);
        return item.getQuantityInStock();
    }

    /**
     * Reduces the quantity in stock for the specified item.
     * @param itemName - sold item's name
     * @param quantity - sold quantity
     * @return - returns the current quantity in stock, if the sale is successful. Else returns -1;
     */
    public int sellStock(String itemName, int quantity) {
        if (quantity < 0) {
            return -1;
        }
        StockItem existingItem = this.stockList.getOrDefault(itemName, null);

        if ((existingItem != null) && (existingItem.getQuantityInStock() >= quantity)) {
            existingItem.adjustStockLevel(-quantity);
            this.stockList.put(existingItem.getName(), existingItem);
            return existingItem.getQuantityInStock();
        }
        return -1;
    }

    public boolean removeItem(String itemName) {
        StockItem removedItem = this.stockList.remove(itemName);
        return (removedItem != null);
    }

    public boolean hasStock(String itemName, int quantity) {
        StockItem item = this.stockList.get(itemName.trim());
        if (item != null) {
            return (item.getQuantityInStock() > quantity);
        }
        return false;
    }

    public void printStockList() {
        String message = "\nStock has " + stockList.size() + " products: \n";
        double stockTotalValue = 0;
        for (Map.Entry<String, StockItem> mapEntry : this.stockList.entrySet()) {
            StockItem item = mapEntry.getValue();
            double itemValue = (item.getUnitPrice() * item.getQuantityInStock());
            message = message + item + "\t , Stock quantity = " + item.getQuantityInStock()
                    + "\n\tTotal item value = " + itemValue + "\n";
            stockTotalValue += itemValue;
        }
        message += "\nTotal Stock Value: " + stockTotalValue;
        System.out.println(message);
    }

}
