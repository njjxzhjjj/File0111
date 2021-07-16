package com.hp.file;
/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class FileTest02 {
    public static void main(String[] args) {
        //用户输入一个文件名并使用File在当前目录下创建出来
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String input = scan.nextLine().trim();//去除两边空白
        //使用路径构造File对象（在当前目录下创建test.txt文件）
        File file = new File("test.txt");
        //判断文件是否存在
        boolean exists = file.exists();
        //若不存在就创建新文件
        if(!exists){//若不存在
            try {
                //如果不存在创建文件
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            //若该文件已存在,就创建名为：test_副本1.txt 的文件，
            // 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
            int a = 0;
            while(exists){
                a++;
                file = new File("test_副本"+a+".txt");
                exists = file.exists();//判断文件是否存在
            }
            try {
                //当文件不存在时，接着创建新文件
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("文件名:"+file.getName());
    }
}
