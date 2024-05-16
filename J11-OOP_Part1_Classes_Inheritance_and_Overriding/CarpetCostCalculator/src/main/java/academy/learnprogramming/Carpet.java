package academy.learnprogramming;

/**
 * Represents the Carpet and the related parameters such as cost per square meter.
 */
public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = 0;

        if (cost >= 0) {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = 0;

        if (cost >= 0) {
            this.cost = cost;
        }
    }
}
