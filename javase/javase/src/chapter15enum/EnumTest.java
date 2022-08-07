/*
 * @Author: YPL
 * @Date: 2022-08-06 18:33:54
 * @Description: 
 */
package chapter15enum;

public class EnumTest {
    // 传统的定义方法
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
        DayEnum dayEnum = DayEnum.FRIDAY;
        //.name() 返回此枚举的常量名称
        String name = dayEnum.name();
        System.out.println(name );
        //.ordinal() 获取的是枚举变量在枚举类中的声明顺序，从下标
        // 0 开始，它在枚举声明中的位置，其中初试常量序数为零，
        //如果枚举的位置发生变化，对应的值也会变化
        int ordinal = dayEnum.ordinal();
        System.out.println(ordinal);
        //toString() 和 name方法一样
        String toString = dayEnum.toString();
        System.out.println(toString);
        //valueOf() 通过字符串获取对应的枚举值
        DayEnum d = DayEnum.valueOf("MONDAY");
        System.out.println(d.toString());
        //values() 获取枚举类中所有的变量，并作为数组返回
        DayEnum [] arr = DayEnum.values();
        for(DayEnum temp : arr){
            System.out.println(temp.toString());
        }
    }

}

enum DayEnum{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}


enum SexEnum{
    BOY,GIRL 
}