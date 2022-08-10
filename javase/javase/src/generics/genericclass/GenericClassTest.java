/*
 * @Author: YPL
 * @Date: 2022-08-07 16:19:45
 * @Description: 
 */
package generics.genericclass;

public class GenericClassTest {
    public static void main(String[] args) {
        
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        System.out.println(genericInteger.getKey());
        // 不传入泛型实参
        Generic g = new Generic("12345678");
        System.out.println(g);


        /**
         * 泛型的类型参数只能是类类型，不能是简单类型。
         *   不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
         */
        // if(genericInteger instanceof Generic<Integer>){
        //     System.out.println("it is the instance of the last thing");
        // }
        //这样是可以的
        if(genericInteger instanceof Generic){
            System.out.println("it is the instance of the last thing");
        }

        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        showKeyValue(gNumber);
        showKeyValue1(gNumber);

    }

    public static void showKeyValue(Generic<Number> obj){
        System.out.println(obj.getKey());
    }

    public static void showKeyValue1(Generic<?> obj){
        System.out.println(obj.getKey());
    }

    
}
