package org.highProgram.eleven;

import java.io.*;

//复制文件没有中文处理所以使用字节流
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //源文件路径
        File file=new File("E:"+File.separator+"Demo"+File.separator+"aop.png");
        //复制的文件路径
        File copyFile=new File("E:"+File.separator+"Demo"+File.separator+"Demo.png");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if(!file.exists()){
            file.createNewFile();
            System.out.println("没有文件信息！");
        }
        //定义处理文件内容的对象
        InputStream inputStream=new FileInputStream(file);
        OutputStream outputStream=new FileOutputStream(copyFile);
        //读入文件
        int len=0;//定义读入文件的长度
        byte[] data = new byte[1024];
        while ((len=inputStream.read(data))!=-1){
            //写入文件
            outputStream.write(data,0,len);
        }
        //关闭对象
        inputStream.close();
        outputStream.close();
    }
}
