package dtos.error;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationErrorTest {
    ValidationError ve;

    @Before
    public void initialize(){
        ve = new ValidationError();
    }
    @Test
    public void getCodeTest() {
        Assert.assertEquals(null, ve.getCode());
    }

    @Test
    public void setCodeTest() {
        ve.setCode("1234");
        Assert.assertEquals("1234", ve.getCode());
    }

    @Test
    public void getMessageTest() {
        Assert.assertEquals(null, ve.getMessage());
    }

    @Test
    public void setMessageTest() {
        ve.setMessage("Sleep for the weak.");
        Assert.assertEquals("Sleep for the weak.", ve.getMessage());
    }
}