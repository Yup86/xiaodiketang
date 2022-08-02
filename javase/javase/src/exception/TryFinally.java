/*
 * @Author: YPL
 * @Date: 2022-08-02 17:14:58
 * @Description: 
 */
package exception;

public class TryFinally {
    
    public static void main(String[] args) {
        
        try{
            int res = 30/0;
        }finally{
            System.out.println("this");
        }
    }
}
