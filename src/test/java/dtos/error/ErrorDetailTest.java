package dtos.error;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ErrorDetailTest {
    ErrorDetail errorDetail;

    @Before
    public void initialize(){
        errorDetail = new ErrorDetail();
    }

    @Test
    public void getErrorsTest() {
        Map<String, List<ValidationError>> map = new HashMap<>();
        Assert.assertEquals(null, errorDetail.getErrors());
    }

    @Test
    public void setErrorsTest() {

        Map<String, List<ValidationError>> map = new HashMap<>();
        errorDetail.setErrors(map);
        Assert.assertEquals(map, errorDetail.getErrors());
    }

    @Test
    public void getTitleTest() {
        Assert.assertEquals(null, errorDetail.getTitle());
    }

    @Test
    public void setTitleTest() {
        errorDetail.setTitle("Narnia: The Lion, The Witch, and the Wardrobe");
        Assert.assertEquals("Narnia: The Lion, The Witch, and the Wardrobe", errorDetail.getTitle());
    }

    @Test
    public void getStatusTest() {
        Assert.assertEquals(0, errorDetail.getStatus());
    }

    @Test
    public void setStatusTest() {
        errorDetail.setStatus(100);
        Assert.assertEquals(100, errorDetail.getStatus());
    }

    @Test
    public void getDetailTest() {

        Assert.assertEquals(null, errorDetail.getDetail());
    }

    @Test
    public void setDetailTest() {
        errorDetail.setDetail("Great Movie");
        Assert.assertEquals("Great Movie", errorDetail.getDetail());
    }

    @Test
    public void getTimeStampTest() {
        Assert.assertEquals(0, errorDetail.getTimeStamp());
    }

    @Test
    public void setTimeStampTest() {
        errorDetail.setTimeStamp(100000);
        Assert.assertEquals(100000, errorDetail.getTimeStamp());
    }

    @Test
    public void getDeveloperMessageTest() {
        Assert.assertEquals(null, errorDetail.getDeveloperMessage());
    }

    @Test
    public void setDeveloperMessageTest() {
        errorDetail.setDeveloperMessage("No error.");
        Assert.assertEquals("No error.", errorDetail.getDeveloperMessage());
    }
}