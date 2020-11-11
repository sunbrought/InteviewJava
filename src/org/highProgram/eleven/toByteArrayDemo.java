package org.highProgram.eleven;

import java.io.*;

public class toByteArrayDemo {
    public static void main(String[] args) throws IOException {
        //设置操作文件路径
        File filea=new File("E:"+File.separator+"infoa.txt");
        File fileb=new File("E:"+File.separator+"infob.txt");
        //创建输入输出流对象
        InputStream inputStreama=new FileInputStream(filea);
        InputStream inputStreamb=new FileInputStream(fileb);
        //如果不使用向上转型则可以使用它特有的toByteArray()方法创建一个新分配的字节数组
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        int temp=0;
        while ((temp=inputStreama.read())!=-1){
            byteArrayOutputStream.write(temp);
        }
        while ((temp=inputStreamb.read())!=-1){
            byteArrayOutputStream.write(temp);
        }
        //字节是二进制的数据，所以必须使用String类转换成字符串输出
        byte[] data=byteArrayOutputStream.toByteArray();
        System.out.println(new String(data));
        inputStreama.close();
        inputStreamb.close();
        byteArrayOutputStream.close();
    }
}
