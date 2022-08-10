/*
 * @Author: YPL
 * @Date: 2022-08-09 20:43:00
 * @Description: 
 */
package annotation;

public class MyClass {
    
    
    
    @MyCustomAnnotation(studentName = "Jerry",studnetAddress = "Jerry's home")
    public void method01(){
        System.out.println("this is method01");     
    }
    


    
}
