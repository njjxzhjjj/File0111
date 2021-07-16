package com.hp.file;
/*
* 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
* */
import java.text.SimpleDateFormat;
import java.io.File;
public class FileTest01 {
    public static void main(String[] args) {
        //使用路径构造File对象通过File输出当前项目目录下的文件"myfile.txt"的名字
        File file1 = new File("D:\\ppp\\ooo\\myfile.txt");
        //长度
        System.out.println(file1.length());
        //名字
        System.out.println(file1.getName());
        //最后修改lastModified()
        System.out.println(file1.lastModified());
        //修改日期该是为"yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化修改最后时间。最后修改lastModified()
        System.out.println(df.format(file1.lastModified()));
    }
}
