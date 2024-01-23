package academy.learnprogramming;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1994));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(-1, 2020));
    }

    // Option 1:
    /*private static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            return false;
        }

        if ((year % 4 == 0) && (year % 100 > 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }

        return false;
    }*/

    private static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            return false;
        }

        return (((year % 4 == 0) && (year % 100 > 0)) || (year % 400 == 0));
    }

    private static int getDaysInMonth(int month, int year) {

        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        int numOfDays;

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numOfDays = 30;
                break;
            default:
                numOfDays = -1;
                break;
        }

        return numOfDays;
    }
}
