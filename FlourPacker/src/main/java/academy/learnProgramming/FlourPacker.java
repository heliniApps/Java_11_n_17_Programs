package academy.learnProgramming;

public class FlourPacker {

    /**
     *
     * @param bigCount - The count of big flour bags (5 kilos each).
     * @param smallCount - The count of small flour bags (1 kilo each).
     * @param goal - The goal amount of kilos of flour needed to assemble a package.
     * @return - Returns true, if the goal amount of kilos can be prepared,
     *           using the available big and small flour bags. Otherwise, returns false.
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(!isValidArgument(bigCount) || !isValidArgument(smallCount) || !isValidArgument(goal)) {
            return false;
        }
        if (!isValidGoal(bigCount, smallCount, goal)) {
            return false;
        }

        int requiredBigBags = goal / 5;
        int requiredSmallBags = goal % 5;

        if ((bigCount >= requiredBigBags) && (smallCount >= requiredSmallBags)) {
            return true;
        } else if (bigCount < requiredBigBags) {
            int additionalSmallBags = (requiredBigBags - bigCount) * 5;
            if (smallCount >= (requiredSmallBags + additionalSmallBags)) {
                return true;
            }
        } else if (smallCount >= goal) {
            return true;
        }

        return false;
    }

    private static boolean isValidArgument(int arg) {
        return (arg >= 0);
    }

    private static boolean isValidGoal(int bigCount, int smallCount, int goal) {

        int allAvailableKilos = ((bigCount * 5) + smallCount);

        return (allAvailableKilos >= goal);
    }
}
