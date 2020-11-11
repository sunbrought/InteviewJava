package org.highProgram.eleven;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //设置文件的路径
        File file=new File("E:"+File.separator+"Demo"+File.separator+"Demo.txt");
        //判断目录是否为空
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //打开与实际文件的连接创建一个InptStream对象
        InputStream inputStream=new FileInputStream(file);
        //定义字节数组，使用字节数组进行读取
        byte data1[]= new byte[1024];
        int foot=0;//定义数组的角标
        int temp=0;//表示接收每次读取的字节数据
        while((temp=inputStream.read())!=-1){
            data1[foot++]= (byte) temp;
        }
        inputStream.close();
        System.out.println("["+new String(data1,0,foot)+"]");
    }
}
