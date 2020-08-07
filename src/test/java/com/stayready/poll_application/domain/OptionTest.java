package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OptionTest {

    Option option;
    @Before
    public void initialize() {
        option = new Option();
    }

    @Test
    public void getIdTest() {
        // Given
        Long expected = 1L;
        option.setId(expected);

        // When
        Long actual = option.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() {
        // Given
        Long expected = 1L;

        // When
        option.setId(expected);
        Long actual = option.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getValueTest() {
        // Given
        String expected = "Washington";
        option.setValue(expected);

        // When
        String actual = option.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setValueTest() {
        // Given
        String expected = "Washington";

        // When
        option.setValue(expected);
        String actual = option.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
