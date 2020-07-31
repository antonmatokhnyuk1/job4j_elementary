package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 2;
        double rsl = SqArea.square(6, 2);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when4and1then1() {
        double expected = 1;
        double rsl = SqArea.square(4, 1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when6and2then2() {
        double expected = 2;
        double rsl = SqArea.square(6, 2);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when12and2then2() {
        double expected = 2;
        double rsl = SqArea.square(6, 2);
        assertThat(rsl, is(expected));
    }
}

