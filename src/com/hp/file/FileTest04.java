package com.hp.file;

import java.io.File;

/*
 * 获取并输出当前目录下的所有文件和目录的名字
 */
public class FileTest04 {
    public static void main(String[] args) {
        //（创建文件）获取并输出当前目录下所有文件的名字
        File file = new File(".");
        //创建一个数组列表文件
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            //判断是否及是文件又是目录，,是的话就输出
            // ||（或）满足一个就可以，&&（且/与）两个都要满足   ! （非）
            if (files[i].isFile() || files[i].isDirectory()) {
                System.out.println(files[i].getName());
            }
        }
    }
}
