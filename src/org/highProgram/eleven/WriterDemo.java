package org.highProgram.eleven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //设置文件的路径
        File file=new File("E:"+File.separator+"Demo"+File.separator+"Demo.txt");
        //判断目录是否为空
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //打开与实际的连接创建一个Writer对象
        Writer writer=new FileWriter(file);
        //以字符串的形式写出数据
        String str="好好学习，天天向上!";
        writer.write(str);
        //以字符数组写出数据
        char[] ch=str.toCharArray();
        writer.write(ch);
        //强制清除缓冲区
        writer.flush();
    }
}
