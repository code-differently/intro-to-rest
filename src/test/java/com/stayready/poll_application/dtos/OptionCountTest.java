package com.stayready.poll_application.dtos;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionCountTest {
    OptionCount optionCount;
    @Before
    public void setup() {
        optionCount = new OptionCount();
    }

    @Test
    public void getOptionIdTest() {
        assertNull(optionCount.getOptionId());
    }

    @Test
    public void setOptionIdTest() {
        Long expected = 3L;

        optionCount.setOptionId(expected);
        Long actual = optionCount.getOptionId();

        assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        int expected = 0;

        int actual = optionCount.getCount();

        assertEquals(expected, actual);
    }

    @Test
    public void setCountTest() {
        int expected = 4;

        optionCount.setCount(expected);
        int actual = optionCount.getCount();

        assertEquals(expected, actual);
    }
}
