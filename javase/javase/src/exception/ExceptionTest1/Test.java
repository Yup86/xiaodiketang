/*
 * @Author: YPL
 * @Date: 2022-08-02 16:51:11
 * @Description: 
 */
package exception.ExceptionTest1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        try{
        s.setAge(-1);
        }catch(NullPointerException e){
            System.out.println("exception");
            e.printStackTrace();
        }catch(IllegalArgumentException e1){
            e1.printStackTrace();
        }
    }
}
