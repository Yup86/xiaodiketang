/*
 * @Author: YPL
 * @Date: 2022-08-02 15:19:46
 * @Description: 
 */
package instanceOf;

public class InstanceOfTest {
    public static void main(String[] args) {
        User user = new User();
        SubUser subUser = new SubUser();
        boolean res0 = user instanceof User;
        System.out.println(res0);
        boolean res1 = user instanceof Person;
        System.out.println(res1);
        boolean res2 = subUser instanceof Person;
        System.out.println(res2);
        String name = "ABCDEFG";
        boolean res = name instanceof String;
        System.out.println(res);
    }
}
