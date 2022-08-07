/*
 * @Author: YPL
 * @Date: 2022-08-06 22:35:13
 * @Description: 
 */
package chapter14object;

public class ObjectTest {
    public static void main(String[] args) {
        
      Class clazz = new ObjectTest().getClass();
      //获取类名
      System.out.println(clazz.getName());
      
    }
}
