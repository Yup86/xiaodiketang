/*
 * @Author: YPL
 * @Date: 2022-08-02 20:08:56
 * @Description: 
 */
package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamTest {
    
    public static void main(String[] args) {
        
        //字节流
        // try (FileInputStream fileIn = new FileInputStream("file")) {
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }


       
        //字符流
        

         inputStreamTest();
        

    }






    public static void inputStreamTest(){
        String dir = "D:\\0projects\\java\\xiaodiketang";
        String name = "xxx.txt";
        File file = new File(dir,name);
        try (InputStream inputStream = new FileInputStream(file)) {
            // testRead(inputStream);
            testReadByByteArr(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
    }

    public static void testReadByByteArr(InputStream inputStream) throws IOException{
        //如果buff的长度为0，则不读取任何字节并返回0；每次读取的字节数最多等于buff的长度
        byte[] buf = new byte[2];
        
        int length;
        // 在while 循环体内赋值
        while((length = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,length));
        }
    }

    public static void testRead(InputStream inputStream) throws IOException{
        
        long skipSize = inputStream.skip(2);
        System.out.println(skipSize);

        // 对于汉字 unicode中的字符不能正常读取，只能以乱码显示
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
       
    }

    

}
