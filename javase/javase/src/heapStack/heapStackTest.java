/*
 * @Author: YPL
 * @Date: 2022-07-26 18:25:43
 * @Description: 
 */
package heapStack;

import java.util.Arrays;

public class heapStackTest {
    public static void main(String[] args) {
        int age = 10;
        int age2 = 20;
        age = 30;
        // 基本类型都是值传递
        age2 = age;
        age = 40;
        System.out.println(age2);

        // 字符串常量池 这个很特殊
        //String 到底是值传递还是引用传递？？？？
        //https://blog.csdn.net/qingyuanww/article/details/109146603#:~:text=%E9%A6%96%E5%85%88%EF%BC%8C%E5%A4%A7%E9%83%A8%E5%88%86%E6%83%85%E5%86%B5%E4%B8%8B,%E4%BC%A0%E5%85%A5%E5%88%B0%E6%96%B9%E6%B3%95%E4%BD%93%E3%80%82
        //https://www.cnblogs.com/Andya/p/14067618.html
        String a = "abcdefg";
        String b = "I love you";
        b = a;
        System.out.println(a);
        System.out.println(b);

        a = "1234567";
        System.out.println(a);
        //这里的打印结果没有改变为什么？
        //https://blog.51cto.com/u_14799494/2506722#:~:text=%E6%8C%89%E7%85%A7%E5%89%8D%E9%9D%A2%E7%9A%84%E4%BE%8B%E5%AD%90%EF%BC%8CString,%E7%BB%93%E6%9E%9C%E5%BA%94%E8%AF%A5%E6%98%AF%E2%80%9Dcd%E2%80%9D%E3%80%82
        System.out.println(b); 

        int [] a1 = {1,2,3};
        int [] b1 = a1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
        a1[0] = 9;
        b1[1] = 8;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
    }
}
