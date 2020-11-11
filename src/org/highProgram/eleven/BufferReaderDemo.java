package org.highProgram.eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        //使用BufferReader来进行读取内容（输入字符缓冲流），键盘输入
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        Boolean flag=true;
        while (true){
            System.out.println("请输入你的年龄：");
            String  str=bufferedReader.readLine();
            if(str.matches("\\d{1,3}")){
                System.out.println("你输入的年龄："+str);
                flag=false;
            }else{
                System.out.println("你输入的年龄格式有问题，请重新输入！");
            }
            bufferedReader.close();
        }
    }
}
