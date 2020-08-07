package com.stayready.poll_application.dtos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OptionCountTest {

    OptionCount optionCount;
    @Before
    public void initialize() {
        optionCount = new OptionCount();
    }

    @Test
    public void getOptionIdTest() {
        // Given
        Long expected = 1L;
        optionCount.setOptionId(expected);

        // When
        Long actual = optionCount.getOptionId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOptionIdTest() {
        // Given
        Long expected = 1L;

        // When
        optionCount.setOptionId(expected);
        Long actual = optionCount.getOptionId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        // Given
        int expected = 1;
        optionCount.setCount(expected);

        // When
        int actual = optionCount.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCountTest() {
        // Given
        int expected = 1;

        // When
        optionCount.setCount(expected);
        int actual = optionCount.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
