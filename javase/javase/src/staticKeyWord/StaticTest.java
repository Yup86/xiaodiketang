/*
 * @Author: YPL
 * @Date: 2022-07-26 19:13:58
 * @Description: 
 */
package staticKeyWord;

public class StaticTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name  = "小D";
        Student.age = 10;
        Student student2 = new Student();
        student2.name  = "小D2";
        Student student3 = new Student();
        student3.name  = "小D3";
        System.out.println(student1.name);
        System.out.println(student1.getAge());
        System.out.println(student2.name);
        System.out.println(student2.getAge());
        System.out.println(student3.name);
        System.out.println(student3.getAge());
    }
}
