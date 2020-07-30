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
}