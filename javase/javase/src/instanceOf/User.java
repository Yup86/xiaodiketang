/*
 * @Author: YPL
 * @Date: 2022-08-02 15:17:11
 * @Description: 
 */
package instanceOf;

public class User implements Person{
    private String name;
    private String age;

    public User(){

    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
}
