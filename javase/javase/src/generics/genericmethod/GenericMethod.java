/*
 * @Author: YPL
 * @Date: 2022-08-09 20:59:37
 * @Description: 
 */
package generics.genericmethod;

//泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型 。
public class GenericMethod {
    /**
     * 
     * @param <T>
     * @param tClass 传入的泛型实参
     * @return T 返回值为T类型
     * @throws InstantiationException
     * @throws IllegalAccessException
     * 1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     * 2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     * 3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     *  4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     * CLass类和Object类的关系
        Object类和Class类没有直接的关系。
    Object类是一切java类的父类，对于普通的java类，即便不声明，也是默认继承了Object类。典型的，可以使用Object类中的toString()方法。

    Class类是用于java反射机制的，一切java类，都有一个对应的Class对象，他是一个final类。Class 类的实例表示，正在运行的 Java 应用程序中的类和接口。
     */
    public <T> T genericMethod(Class<T> tClass) throws InstantiationException,IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
    }
}
