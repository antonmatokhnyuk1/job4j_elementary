package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when0and0and2and0then2() {
        double expected = 2;
        double rsl = Point.distance(0, 0, 2, 0);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0and0and4and0then16() {
        double expected = 4;
        double rsl = Point.distance(0, 0, 4, 0);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0and0and6and0then6() {
        double expected = 6;
        double rsl = Point.distance(0, 0, 6, 0);
        assertThat(rsl, is(expected));
    }
}