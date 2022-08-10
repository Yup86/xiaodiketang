/*
 * @Author: YPL
 * @Date: 2022-08-07 19:35:02
 * @Description: 
 */
package generics.genericinterface;

// 什么是泛型实参
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */

public class FruitGenerator<T> implements Generator<T> {

    @Override
    public T next() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
