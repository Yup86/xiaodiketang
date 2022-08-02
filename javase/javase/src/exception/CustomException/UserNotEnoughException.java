/*
 * @Author: YPL
 * @Date: 2022-08-02 18:00:03
 * @Description: 
 */



package exception.CustomException;


public class UserNotEnoughException extends Exception{
    private int code;
    private String message;
    
    public UserNotEnoughException(){
        //必须是第一行
        super();
    }

    

    public UserNotEnoughException( int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
}