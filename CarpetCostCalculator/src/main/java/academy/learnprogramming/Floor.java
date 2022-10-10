package academy.learnprogramming;

/**
 * Properties related to the floor area of a room.
 */
public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = 0;
        this.length = 0;

        if (width >= 0) {
            this.width = width;
        }
        if (length >= 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = 0;

        if (width >= 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = 0;

        if (length >= 0) {
            this.length = length;
        }
    }

    public double getArea() {
        return (this.getWidth() * this.getLength());
    }
}
