package academy.learnprogramming;

public class DiagonalStar {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String STAR_ICON = "*";

    public static void main(String[] args) {

        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
        System.out.println();
        printSquareStar(12);

        System.out.println();
        starTriangle(9);
        System.out.println();
        starTriangle(14);
    }

    private static void printSquareStar(int numOfRows) {

        if (numOfRows < 5) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        for (int row=1; row <= numOfRows; row++) {
            for (int col=1; col <= numOfRows; col++) {

                if (row == 1) {
                    System.out.print(STAR_ICON);
                } else if (row == numOfRows) {
                    System.out.print(STAR_ICON);
                } else if (col == 1) {
                    System.out.print(STAR_ICON);
                } else if (col == numOfRows) {
                    System.out.print(STAR_ICON);
                } else if (row == col) {
                    System.out.print(STAR_ICON);
                } else if (col == ((numOfRows - row) + 1)) {
                    System.out.print(STAR_ICON);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void starTriangle(int numOfRows) {

        for (int row=numOfRows; row > 0; row--) {
            for (int col=1; col <= numOfRows; col++) {

                if (row == numOfRows) {
                    System.out.print(STAR_ICON);
                } else if ((col - row) > 0) {
                    System.out.print(" ");
                } else if (col <= (numOfRows - row)) {
                    System.out.print(" ");
                } else {
                    System.out.print(STAR_ICON);
                }
            }
            System.out.println();
        }
    }
}
