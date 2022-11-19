package main.java.com.academy.cart;

public class ShoppingCartMain {

    public static void main(String[] args) {

        Process process = Process.initiateShoppingCart();
        process.printStockList();
        System.out.println();

        ShoppingCart cart = new ShoppingCart("Antelope");
        process.addToCart(cart, "Bread", 2);
        process.addToCart(cart, "Apple", 3);
        process.addToCart(cart, "Biscuits", 4);
        process.addToCart(cart, "Flour", 1);
        cart.printCart();
        process.printStockList();

        process.addToCart(cart, "Flour", 59);
        cart.printCart();
        process.printStockList();

        System.out.println("****************************************");
        process.removeFromCart(cart, "Biscuits", 2);
        process.removeFromCart(cart, "Apple", 2);
        process.removeFromCart(cart, "Bread", 1);
        process.removeFromCart(cart, "Flour", 5);
        cart.printCart();
        process.printStockList();

    }
}
