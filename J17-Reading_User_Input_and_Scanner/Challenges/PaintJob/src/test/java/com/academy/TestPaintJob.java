package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPaintJob {

    @Test
    void getBucketCountWidthAndHeight() {
        Assertions.assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, -2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, 2.1, -1.5, 2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, 2.1, 1.5, -2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(0, 2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, 0, 1.5, 2));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, 2.1, 0, 2));

        Assertions.assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        Assertions.assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5, 0));
        Assertions.assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        Assertions.assertEquals(0, PaintJob.getBucketCount(2.75, 3.25, 2.5, 5));
        Assertions.assertEquals(0, PaintJob.getBucketCount(3.4, 2.1, 1.5, 5));
    }

    @Test
    void getBucketCountNoExtraBuckets() {
        Assertions.assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        Assertions.assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
        Assertions.assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));
    }

    @Test
    void getBucketCountArea() {
        Assertions.assertEquals(-1, PaintJob.getBucketCount(-3.4, 1.5));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, -1.5));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(0, 1.5));
        Assertions.assertEquals(-1, PaintJob.getBucketCount(3.4, 0));

        Assertions.assertEquals(3, PaintJob.getBucketCount(3.4, 1.5));
        Assertions.assertEquals(3, PaintJob.getBucketCount(6.26, 2.2));
        Assertions.assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}