package org.highProgram.eleven;

import java.io.*;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //需要操作的字符串
        String str="Hello*World";
        //通过内存流是实现转换。先将数据保存在内存流中，而后从里边取出每一个数据
        //将所有要读取的数据设置到内存输入流中，本此利用向上转型
        InputStream inputStream=new ByteArrayInputStream(str.getBytes());
        //为了将所有的内存里数据取出，可以使用ByteArrayOutputStream
        OutputStream outputStream=new ByteArrayOutputStream();
        int temp=0;//读取每一个字节数据，所有的数据将保存在内存数据输出流中
        while ((temp=inputStream.read())!=-1){//每次读取一个数据
            //字节输出流
            outputStream.write(Character.toUpperCase(temp));
        }
        System.out.println(outputStream);
        inputStream.close();
        outputStream.close();
    }
}
