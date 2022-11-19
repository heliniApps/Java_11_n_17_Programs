package main.java.com.academy.cart;

import main.java.com.academy.stock.StockItem;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {

    private final String name;
    private final Map<StockItem, Integer> itemList;

    public ShoppingCart(String name) {
        this.name = name;
        this.itemList = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(itemList);
    }

    public int getOrderQuantity(StockItem item) {
        return this.itemList.getOrDefault(item, 0);
    }

    public boolean addItem(StockItem item, int orderQuantity) {
        if ((item == null) || (orderQuantity < 0)) {
            return false;
        }
        int existingQty = getOrderQuantity(item);
        this.itemList.put(item, (existingQty + orderQuantity));

        return true;
    }

    public boolean removeItem(StockItem item, int quantity) {
        if ((item == null) || (quantity < 0)) {
            return false;
        }
        int existingQty = getOrderQuantity(item);
        if (existingQty <= quantity) {
            this.itemList.remove(item);
        } else {
            this.itemList.put(item, (existingQty - quantity));
        }
        return true;
    }

    public void printCart() {
        String message = "\nShopping Cart '" + getName() + "' has " + itemList.size() + " items: \n";
        double orderTotal = 0;
        for (Map.Entry<StockItem, Integer> mapEntry : this.itemList.entrySet()) {
            double itemPrice = (mapEntry.getKey().getUnitPrice() * mapEntry.getValue());
            message = message + mapEntry.getKey() + "\n\t\tOrder quantity = " + mapEntry.getValue()
                    + " , Total item price = " + itemPrice + "\n";
            orderTotal += itemPrice;
        }
        message += "\nOrder Total Price: " + orderTotal;
        System.out.println(message);
    }

}
