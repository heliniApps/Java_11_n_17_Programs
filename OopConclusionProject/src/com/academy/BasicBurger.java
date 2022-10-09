package com.academy;

public class BasicBurger {

    private BreadRoll breadRoll;
    private Meat meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public BasicBurger(BreadRoll breadRoll, Meat meat) {
        this(breadRoll, meat, null, null, null, null);
    }

    public BasicBurger(BreadRoll breadRoll, Meat meat, Addition addition1,
                       Addition addition2, Addition addition3, Addition addition4) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public double getPrice() {

        double totalPrice = 0;

        if (getBreadRoll() != null) {
            totalPrice += getBreadRoll().getPrice();
        }
        if (getMeat() != null) {
            totalPrice += getMeat().getPrice();
        }
        if (getAddition1() != null) {
            totalPrice += getAddition1().getPrice();
        }
        if (getAddition2() != null) {
            totalPrice += getAddition2().getPrice();
        }
        if (getAddition3() != null) {
            totalPrice += getAddition3().getPrice();
        }
        if (getAddition4() != null) {
            totalPrice += getAddition4().getPrice();
        }

        return totalPrice;
    }

    public void printItems() {
        System.out.println("Items included in this burger:");

        if (getBreadRoll() != null) {
            System.out.println(String.format("Bread roll type: %1$s  ,  Price: %2$.2f",
                    getBreadRoll().getType(), getBreadRoll().getPrice()));
        }
        if (getMeat() != null) {
            System.out.println(String.format("Meat type: %1$s  ,  Price: %2$.2f",
                    getMeat().getType(), getMeat().getPrice()));
        }
    }
}
