package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptionTest {

    Option option;
    @Before
    public void initialize(){
        option = new Option();
    }

    @Test
    public void getIdTest() {

        Assert.assertEquals(null, option.getId());

    }

    @Test
    public void setIdTest() {

        option.setId(1L);
        Assert.assertEquals(Long.valueOf(1), option.getId());
    }

    @Test
    public void getValueTest() {

        Assert.assertEquals(null, option.getValue());
    }

    @Test
    public void setValueTest() {

        option.setValue("Decimal");
        Assert.assertEquals("Decimal", option.getValue());

    }
}