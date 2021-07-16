package com.hp.file;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 */
public class FileTest03 {
    public static void main(String[] args) {
        //用户输入一个文件名并使用File在当前目录下创建出来
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目录名:");
        String input = scan.nextLine();
        //使用路径构造File对象（在当前目录下创建aa）
        File file = new File("aa");
        //判断目录是否存在
        boolean exists = file.exists();
        //若不存在就创建新目录
        if(!exists){//若不存在
                //创建新目录
                file.mkdir();
        }else {
            //若该文件已存在,就创建名为：aa_副本1 的文件，
            // 若该文件也存在了，则创建名为:aa_副本2 的文件，以此类推
            int a = 0;
            while (exists) {
                a++;
                file = new File("aa_副本" + a);
                exists = file.exists();
            }
            file.mkdir();
        }
        System.out.println("目录名:"+file.getName());
    }
}
