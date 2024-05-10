package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestPaintJobArchive {

    @Test
    void getBucketCountWithExtra() {
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(-3.4, 2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, -2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, 2.1, -1.5, 2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, 2.1, 1.5, -2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(0, 2.1, 1.5, 2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, 0, 1.5, 2));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, 2.1, 0, 2));

        Assertions.assertEquals(3, PaintJobArchive.getBucketCount(3.4, 2.1, 1.5, 2));
        Assertions.assertEquals(5, PaintJobArchive.getBucketCount(3.4, 2.1, 1.5, 0));
        Assertions.assertEquals(3, PaintJobArchive.getBucketCount(2.75, 3.25, 2.5, 1));
        Assertions.assertEquals(0, PaintJobArchive.getBucketCount(2.75, 3.25, 2.5, 5));
        Assertions.assertEquals(0, PaintJobArchive.getBucketCount(3.4, 2.1, 1.5, 5));
    }

    @Test
    void getBucketCountNoExtraBuckets() {
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(-3.4, 2.1, 1.5));
        Assertions.assertEquals(5, PaintJobArchive.getBucketCount(3.4, 2.1, 1.5));
        Assertions.assertEquals(14, PaintJobArchive.getBucketCount(7.25, 4.3, 2.35));
    }

    @Test
    void testGetBucketCountArea() {
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(-3.4, 1.5));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, -1.5));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(0, 1.5));
        Assertions.assertEquals(-1, PaintJobArchive.getBucketCount(3.4, 0));

        Assertions.assertEquals(3, PaintJobArchive.getBucketCount(3.4, 1.5));
        Assertions.assertEquals(3, PaintJobArchive.getBucketCount(6.26, 2.2));
        Assertions.assertEquals(5, PaintJobArchive.getBucketCount(3.26, 0.75));
    }
}