package com.academy;

public class DeluxeBurger extends BasicBurger {

    private Addition chips;
    private Addition drink;

    public DeluxeBurger(BreadRoll breadRoll, Meat meat) {
        this(breadRoll,
            meat,
            new Addition("Small Chips", 1.5),
            new Addition("Sprite", 2.5));
    }

    public DeluxeBurger(BreadRoll breadRoll, Meat meat, Addition chips, Addition drink) {

        super(breadRoll, meat);

        this.chips = chips;
        this.drink = drink;
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }

    @Override
    public double getPrice() {

        double totalPrice = super.getPrice();

        if (getChips() != null) {
            totalPrice += getChips().getPrice();
        }
        if (getDrink() != null) {
            totalPrice += getDrink().getPrice();
        }

        return totalPrice;
    }

    @Override
    public void printItems() {
        System.out.println("Items included in this burger:");

        if (super.getBreadRoll() != null) {
            System.out.println(String.format("Bread roll type: %1$s  ,  Price: %2$.2f",
                    super.getBreadRoll().getType(), super.getBreadRoll().getPrice()));
        }
        if (getDrink() != null) {
            // using printf(), instead of String.format()
            System.out.printf("Addition type: %1$s  ,  Price: %2$.2f",
                    getDrink().getName(), getDrink().getPrice());
        }

        System.out.println("Total Price = " + getPrice());
    }
}
