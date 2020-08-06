package dtos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptionCountTest {

    OptionCount optionCount;

    @Before
    public void initialize(){
         optionCount = new OptionCount();
    }

    @Test
    public void getOptionIdTest() {

        Assert.assertEquals(null, optionCount.getOptionId());
    }

    @Test
    public void setOptionIdTest() {

        optionCount.setOptionId(1L);
        Assert.assertEquals(Long.valueOf(1), optionCount.getOptionId());
    }

    @Test
    public void getCountTest() {
        Assert.assertEquals(0, optionCount.getCount());
    }

    @Test
    public void setCountTest() {
        optionCount.setCount(10);
        Assert.assertEquals(10, optionCount.getCount());
    }
}