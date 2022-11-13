package main.java.com.academy.cart;

import main.java.com.academy.stock.StockItem;
import main.java.com.academy.stock.StockList;

public class ShoppingCartMain {

    private static final StockList stockList = new StockList();

    public static void main(String[] args) {

        populateStockList();
        stockList.printStockList();
        System.out.println();

        ShoppingCart cart = new ShoppingCart("Antelope");
        addToCart(cart, "Bread", 2);
        addToCart(cart, "Apple", 3);
        addToCart(cart, "Biscuits", 4);
        addToCart(cart, "Flour", 1);
        cart.printCart();
        stockList.printStockList();

        addToCart(cart, "Flour", 59);
        cart.printCart();
        stockList.printStockList();

        System.out.println("****************************************");
        removeFromCart(cart, "Biscuits", 2);
        removeFromCart(cart, "Apple", 2);
        removeFromCart(cart, "Bread", 1);
        removeFromCart(cart, "Flour", 5);
        cart.printCart();
        stockList.printStockList();

    }

    public static boolean addToCart(ShoppingCart cart, String itemName, int quantity) {
        if ((cart == null) || (quantity < 0)) {
            System.out.println("Error adding the item.");
            return false;
        }
        StockItem item = stockList.getItem(itemName.trim());
        if (item != null) {
            if (stockList.sellStock(itemName, quantity) >= 0) {
                return cart.addItem(item, quantity);
            } else {
                System.out.println("Not enough stock available");
                return false;
            }
        } else {
            System.out.println("We don't sell this item.");
        }
        return false;

        // Option 2:
        /*StockItem item = stockList.getItem(itemName.trim());
        if (item != null) {
            if (item.getQuantityInStock() >= quantity) {
                if (stockList.sellStock(itemName, quantity) >= 0) {
                    return cart.addItem(item, quantity);
                }
            } else if ((item.getQuantityInStock() > 0) && (item.getQuantityInStock() < quantity)) {
                System.out.printf("Only %d items available in stock.\n", item.getQuantityInStock());
            } else {
                System.out.println("Item is out of stock.");
            }
        } else {
            System.out.println("We don't sell this item.");
        }
        return false;*/
    }

    public static boolean removeFromCart(ShoppingCart cart, String itemName, int quantity) {
        if ((cart == null) || (quantity < 0)) {
            System.out.println("Error removing item.");
            return false;
        }
        StockItem item = stockList.getItem(itemName);
        if (item != null) {
            StockItem removedFromCart = new StockItem(item.getName(), item.getUnitPrice(), quantity);
            if (stockList.addStock(removedFromCart) >= 0) {
                return cart.removeItem(item, quantity);
            }
        } else {
            System.out.println("Cannot find this item in your shopping cart.");
        }
        return false;

        // Option 2:
        /*StockItem item = stockList.getItem(itemName);
        if (item != null) {
            item.adjustStockLevel(quantity);
            if (stockList.addStock(item) >= 0) {
                return cart.removeItem(item, quantity);
            }
        } else {
            System.out.println("Cannot find this item in your shopping cart.");
        }
        return false;*/
    }

    public static void populateStockList() {
        StockItem tempItem = new StockItem("Bread", 4.5, 78);
        stockList.addStock(tempItem);

        tempItem = new StockItem("Flour", 3.5, 60);
        stockList.addStock(tempItem);

        tempItem = new StockItem("Cup", 1.5, 100);
        stockList.addStock(tempItem);

        tempItem = new StockItem("Umbrella", 10, 50);
        stockList.addStock(tempItem);

        tempItem = new StockItem("Biscuits", 1.5, 150);
        stockList.addStock(tempItem);

        tempItem = new StockItem("Cup", 0.5, 65);
        stockList.addStock(tempItem);
    }
}
