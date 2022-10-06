package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {

    @Test
    void getBucketCount() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 1.5, 0));
        assertEquals(3, PaintJob.getBucketCount(6.26, 2.2, 0));
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75, 0));
    }

    @Test
    void testGetBucketCount() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        assertEquals(4, PaintJob.getBucketCount(2.75, 3.25, 2.5, 0));
    }

    @Test
    void testGetBucketCount1() {
        assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
        assertEquals(14, PaintJob.getBucketCount(7.25, 4.3, 2.35));
    }

    @Test
    void isValidDimension() {
        assertTrue(PaintJob.isValidDimension(12));
        assertTrue(PaintJob.isValidDimension(16.89));

        assertFalse(PaintJob.isValidDimension(-12));
        assertFalse(PaintJob.isValidDimension(0));
    }

    @Test
    void isValidExtraBuckets() {
        assertTrue(PaintJob.isValidExtraBuckets(90));
        assertTrue(PaintJob.isValidExtraBuckets(0));

        assertFalse(PaintJob.isValidExtraBuckets(-1));
    }
}