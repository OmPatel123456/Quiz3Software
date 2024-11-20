package com.jwetherell.algorithms.mathematics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DistanceTest {

    @Test
    public void chebyshevDistance() {
        long[] point1 = {1, 2};
        long[] point2 = {4, 6};
        assertEquals(4, Distance.chebyshevDistance(point1, point2));

        long[] point3 = {0, 0};
        long[] point4 = {5, 3};
        assertEquals(5, Distance.chebyshevDistance(point3, point4));
    }

    @Test
    public void squaredDistance() {
        assertEquals(25.0, Distance.squaredDistance(1, 2, 4, 6), 0.0001);
        assertEquals(16.0, Distance.squaredDistance(0, 0, 4, 0), 0.0001);
    }

    @Test
    public void euclideanDistance() {
        assertEquals(5.0, Distance.euclideanDistance(1, 2, 4, 6), 0.0001);
        assertEquals(4.0, Distance.euclideanDistance(0, 0, 4, 0), 0.0001);
    }
}
