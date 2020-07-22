package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void whenConvert176manWeightThen100() {
    double in = 176;
    double expected = 87.39;
    double out = Fit.manWeight(in);
    Assert.assertEquals(expected, out, 0.01);
    }
}