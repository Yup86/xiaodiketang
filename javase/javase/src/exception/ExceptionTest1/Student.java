/*
 * @Author: YPL
 * @Date: 2022-08-02 16:46:59
 * @Description: 
 */
package exception.ExceptionTest1;

public class Student {
    private int age;
    private String name;
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("参数异常");
        }
    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}
