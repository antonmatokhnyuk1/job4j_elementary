package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenConvert(6,2)SqAreaThen2() {
        double in = (6, 2);
        double expected = 2;
        double out = SqArea.square(in);
        Assert.assertEquals(expected, out);
    }
}