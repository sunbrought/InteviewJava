package org.highProgram.eleven;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建一个Scanner对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的生日：");
        while(scanner.hasNext()){
            String str=scanner.next();
            if(str.matches("\\d{4}-\\d{2}-\\d{2}")){
                System.out.println("你输入的生日为："+str);
            }else{
                System.out.println("输入的生日格式错误，请重新输入！");
            }
        }
        scanner.close();
    }
}
