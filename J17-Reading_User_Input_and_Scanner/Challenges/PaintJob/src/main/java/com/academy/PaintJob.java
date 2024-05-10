package com.academy;

public class PaintJob {

    /**
     * Calculates how many buckets of paint is needed to cover a certain wall area.
     * If there are any extra paint buckets left, number of paint buckets to buy will be reduced.
     *
     * @param width         Width of the wall.
     * @param height        Height of the wall.
     * @param areaPerBucket The area of wall, a single bucket of paint can cover.
     * @param extraBuckets  Number of paint buckets left from previous jobs.
     * @return Required number of paint buckets to paint the entire wall area,
     * after reducing the existing extra paint buckets.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        double area = width * height;
        int bucketCount = (int) Math.ceil(area / areaPerBucket) - extraBuckets;

        return Math.max(bucketCount, 0);
    }

    /**
     * Overloaded method that can be used when there are no extra paint buckets.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    /**
     * Overloaded method that can be used when the surface area is available instead of width and height.
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
