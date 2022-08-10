/*
 * @Author: YPL
 * @Date: 2022-08-07 16:14:14
 * @Description:            
 */
package generics.genericclass;


/**
 * 泛型类型用于类的定义中，被称为泛型类。
 * 通过泛型可以完成对一组类的操作对外开放相同的接口。
 * 最典型的就是各种容器类，如：List、Set、Map。
 */
public class Generic<T> {

    private T key;

    public Generic(T key){
        this.key = key;
    }
    
    public T getKey(){
        return key;
    }



    
}
