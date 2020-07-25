package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class PointTest {

    @Test
    public void whenX1Y1Zero() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl, is(expected));
    }
}