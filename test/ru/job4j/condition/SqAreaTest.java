package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void WhenConvert(6,2)squareThen1() {
        double in1 = 6;
        double in2 = 2;
        double expected = 1;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out);
    }
}