package main.java.com.academy.stock;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double unitPrice;
    private int quantityInStock;

    public StockItem(String name, double unitPrice) {
        this(name, unitPrice, 0);
    }

    public StockItem(String name, double unitPrice, int quantityInStock) {
        this.name = name.trim();
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return this.name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        }
    }

    public void adjustStockLevel(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String compareItemName = ((StockItem) obj).getName().trim();
        return (getName().equals(compareItemName));
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return String.format("Name: %s , Price: %.2f", getName(), getUnitPrice());
    }

    @Override
    public int compareTo(StockItem item) {
        if (this == item) {
            return 0;
        }
        if (item != null) {
            return (getName().compareTo(item.getName()));
        }
        throw new NullPointerException();
    }
}
