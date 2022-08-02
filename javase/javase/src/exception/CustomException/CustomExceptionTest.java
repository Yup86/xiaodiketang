/*
 * @Author: YPL
 * @Date: 2022-08-02 18:07:57
 * @Description: 
 */
package exception.CustomException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try{
            test();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(UserNotEnoughException e){
            int code = e.getCode();
            String msg = e.getMessage();
            System.out.println("code="+code+", msg="+msg);
        }
    }

    public static void test() throws UserNotEnoughException{
        // throw 必须用throws 捕获或者 try catch 捕获
        throw new UserNotEnoughException(-1,"人员不够的异常"); 
    }
}
