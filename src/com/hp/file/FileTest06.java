package com.hp.file;
/**
 * 获取并输出当前目录下所有文件的名字
 */
import  java.io.File;
public class FileTest06 {
    public static void main(String[] args) {
        //（创建文件）获取并输出当前目录下所有文件的名字
        File file = new File(".");

        //创建一个数组列表文件
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            //判断是否是文件,是的话就输出
            if (files[i].isFile()) {
                System.out.println(files[i].getName());
            }
        }
    }
}
