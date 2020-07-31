package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Triangle1Test {
    @Test
    public void whenExist() {
        boolean result = Triangle1.exist(2.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}