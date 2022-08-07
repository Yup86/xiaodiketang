/*
 * @Author: YPL
 * @Date: 2022-08-07 13:06:55
 * @Description: 2d array
 */
package array;

import java.util.Arrays;

public class TwoDArray{

    public static void main(String[] args) {

      oneDArrayTest();

    }


    public static void oneDArrayTest(){

      //字面量初始化方法
      int[] arr = {1,2,3};
      //初始化之后，不符值的打印结果
      int[] arr1 = new int[10];
      //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 全是0
      System.out.println(Arrays.toString(arr1));

    }
 }



