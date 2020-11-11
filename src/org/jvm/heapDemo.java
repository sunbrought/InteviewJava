package org.jvm;

import java.util.Random;

public class heapDemo {


    public static void main(String[] args) {
        String str="hello world hello world";
        System.out.println("使用最大的内存："+Runtime.getRuntime().maxMemory());
        System.out.println("全部的内存："+Runtime.getRuntime().totalMemory());
        while (true){
            str+=str+ new Random().nextInt(888888888)+new Random().nextInt(888889999);
            System.out.println(str);
        }
    }
}
