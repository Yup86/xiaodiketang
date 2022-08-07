/*
 * @Author: YPL
 * @Date: 2022-08-02 19:50:20
 * @Description: 
 */
package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        String dir = "D:\\0projects\\java\\xiaodiketang";

        String name = "a.txt";

        File file = new File(dir,name);

        System.out.println(file.getPath());

        System.out.println(file.separator);

        System.out.println(file.getAbsolutePath());
        
        System.out.println(file.getParent());

        System.out.println(file.isAbsolute());

        System.out.println(file.isDirectory());
        
        System.out.println(file.isFile());

        System.out.println(file.exists());


        File mkdir = new File(dir + "\\xd");
        mkdir.mkdir();


        // 创建多个层级目录 mkdirs
        File mkdirFiles = new File(dir+"\\xd\\aa\\bb\\cc");
        mkdirFiles.mkdirs();

        //创建一个文件
        File newFile = new File(dir+"\\xxx.txt");

        try {
            newFile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
