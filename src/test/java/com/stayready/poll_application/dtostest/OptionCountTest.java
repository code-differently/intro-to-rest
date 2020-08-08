package com.stayready.poll_application.dtostest;

import com.stayready.poll_application.dtos.OptionCount;
import org.junit.Assert;
import org.junit.Test;

public class OptionCountTest {
    @Test
    public void getOptionIdTest() {
        //Given
        long expected = 0;
        //When
        OptionCount optionCount = new OptionCount();
        optionCount.setOptionId(0l);
        long actual = optionCount.getOptionId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setOptionIdTest(){
        //Given
        long expected = 1234567891;
        //When
        OptionCount optionCount = new OptionCount();
        optionCount.setOptionId(1234567891l);
        long actual = optionCount.getOptionId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCountTest(){
        //Given
        int expected = 0;
        //When
        OptionCount optionCount = new OptionCount();
        int actual = optionCount.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setCountTest(){
        //Given
        int expected = 12;
        //When
        OptionCount optionCount = new OptionCount();
        optionCount.setCount(12);
        int actual = optionCount.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
