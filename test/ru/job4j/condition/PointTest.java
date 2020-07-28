package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenConvert2EuroThen140Rbl() {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert3DollarThen180Rbl() {
        int in = 3;
        int expected = 180;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}