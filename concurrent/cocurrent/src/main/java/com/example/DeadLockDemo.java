/*
 * @Author: YPL
 * @Date: 2022-07-24 21:46:56
 * @Description:  死锁demo
 */
package com.example;
public class DeadLockDemo {
    private static final Object HAIRA  = new Object();
    private static final Object HAIRB =  new Object();



    public static void main(String[] args) {
        
        new Thread(()->{
            synchronized(HAIRA){
                synchronized(HAIRB){

                }
            }
        }).start();



        new Thread(()->{
            synchronized(HAIRA){
                synchronized(HAIRB){
                    System.out.println("B 成功");
                }
            }
        }).start();
    }
}
