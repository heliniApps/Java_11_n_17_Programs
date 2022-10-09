package com.academy;

public class HealthyBurger extends BasicBurger{

    private Addition extraAddition1;
    private Addition extraAddition2;

    public HealthyBurger(Meat meat) {
        this(meat,
            null,
            null,
            null,
            null,
            null,
            null);
    }

    public HealthyBurger(Meat meat, Addition addition1, Addition addition2,
                         Addition addition3, Addition addition4) {

        this(meat,
            addition1,
            addition2,
            addition3,
            addition4,
            null,
            null);
    }

    public HealthyBurger(Meat meat, Addition addition1, Addition addition2,
                         Addition addition3, Addition addition4,
                         Addition extraAddition1, Addition extraAddition2) {

        super(new BreadRoll("Brown Rye Bread", 10),
              meat,
              addition1,
              addition2,
              addition3,
              addition4);

        this.extraAddition1 = extraAddition1;
        this.extraAddition2 = extraAddition2;
    }

    public Addition getExtraAddition1() {
        return extraAddition1;
    }

    public Addition getExtraAddition2() {
        return extraAddition2;
    }

    @Override
    public double getPrice() {

        double totalPrice = super.getPrice();

        if (getExtraAddition1() != null) {
            totalPrice += getExtraAddition1().getPrice();
        }
        if (getExtraAddition2() != null) {
            totalPrice += getExtraAddition2().getPrice();
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
        if (super.getAddition1() != null) {
            System.out.println(String.format("Addition type: %1$s  ,  Price: %2$.2f",
                    super.getAddition1().getName(), super.getAddition1().getPrice()));
        }

        System.out.println("Total Price = " + getPrice());
    }
}
