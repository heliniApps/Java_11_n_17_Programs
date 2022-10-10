package academy.learnprogramming;

public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        this.width = 0;
        this.height = 0;

        if (width >= 0) {
            this.width = width;
        }
        if(height >= 0) {
            this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = 0;

        if(height >= 0) {
            this.height = height;
        }
    }

    public double getArea() {
        return (getWidth() * getHeight());
    }
}
