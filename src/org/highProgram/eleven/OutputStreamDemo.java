package org.highProgram.eleven;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //设置文件的路径
        File file=new File("E:"+File.separator+"Demo"+File.separator+"Demo.txt");
        //判断目录是否为空
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //应该使用OutputSream和其子类进行对象实例化(创建或覆盖文件)---如果构造器两个参数表示内容追加
        OutputStream outputStream=new FileOutputStream(file,true);
        //将内容进行输出
        String str="abcdefghijklmnopqrstuvwxyz好";
        byte[] data=str.getBytes();
        //单字节输出
        for(int i=0;i<data.length;i++){
            outputStream.write(data[i]);
        }
        //字节全部输出
        outputStream.write(data);
        //部分字节输出
        outputStream.write(data,2,6);
        //关闭资源操作对象
        outputStream.close();
    }
}
