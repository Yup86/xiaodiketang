/*
 * @Author: YPL
 * @Date: 2022-08-07 16:55:28
 * @Description: 
 */

package generics.genericinterface;
//泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中，可以看一个例子：

 public interface Generator<T>{
    public T next();    
 }



