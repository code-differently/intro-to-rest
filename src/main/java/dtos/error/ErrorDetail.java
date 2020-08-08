package dtos.error;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail {

    private String title;
    private int status;
    private String detail;
    private long timeStamp;
    private String path;
    private String developerMessage;
    private Map<String, List<ValidationError>> errors = new HashMap<>();

    public void setTitle(String title){
        this.title = title;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public void setTimeStamp(Long timeStamp){
        this.timeStamp = timeStamp;
    }

    public void setPath(String path){
        this.path = path;
    }

    public void setDeveloperMessage(String developerMessage){
        this.developerMessage = developerMessage;
    }

    public void setErrors(Map<String, List<ValidationError>> errors){
        this.errors = errors;
    }

    public String getTitle(){
        return title;
    }

    public int getStatus(){
        return status;
    }

    public String getDetail(){
        return detail;
    }

    public Long getTimeStamp(){
        return timeStamp;
    }

    public String getPath(){
        return path;
    }

    public String getDeveloperMessage(){
        return developerMessage;
    }

    public Map<String, List<ValidationError>> getErrors(){
        return errors;
    }
}