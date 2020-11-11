package org.highProgram.eleven;



import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //设置文件的路径
        File file=new File("E:"+File.separator+"Demo"+File.separator+"Demo.txt");
        //判断目录是否为空
        if(file.exists()){
            //创建读入字符流对象
            Reader reader=new FileReader(file);
            char ch[]=new char[1024];
            int len=reader.read(ch);
            reader.close();
            System.out.println(new java.lang.String(ch,0,len));
        }
    }
}
