package academy.learnprogramming;

public class PaintJob {

    public static int getBucketCount(double area, double areaPerBucket, int extraBuckets) {

        if (!isValidDimension(area) || !isValidDimension(areaPerBucket)) {
            return  -1;
        }
        if (!isValidExtraBuckets(extraBuckets)) {
            return -1;
        }

        int totalBuckets = (int) Math.ceil(area / areaPerBucket);

        return (totalBuckets - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (!isValidDimension(width) || !isValidDimension(height) || !isValidDimension(areaPerBucket)) {
            return -1;
        }
        if (!isValidExtraBuckets(extraBuckets)) {
            return -1;
        }

        return getBucketCount((width * height), areaPerBucket, extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (!isValidDimension(width) || !isValidDimension(height) || !isValidDimension(areaPerBucket)) {
            return -1;
        }

        return getBucketCount((width * height), areaPerBucket, 0);
    }

    static boolean isValidDimension(double dimension) {
        return (dimension > 0);
    }

    static boolean isValidExtraBuckets(int extraBuckets) {
        return (extraBuckets >= 0);
    }
}
