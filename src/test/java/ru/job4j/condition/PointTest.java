package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to30then2() {
        double expected = 2;
        Point a = new Point(1, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to21then2() {
        double expected = 2;
        Point a = new Point(0, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then3dot46() {
        double expected = 3.46;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when105to305then2() {
        double expected = 2;
        Point a = new Point(1, 0, 5);
        Point b = new Point(3, 0, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot2() {
        double expected = 5.2;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}