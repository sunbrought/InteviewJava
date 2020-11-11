package org.highProgram.thirteen;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //使用泛型的作用是保证集合中所有元素的类型都一致
        List<String> list=new ArrayList<String>();
        System.out.println("集合的长度："+list.size()+",集合是否为空："+list.isEmpty());
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        System.out.println("集合的长度："+list.size()+",集合是否为空："+list.isEmpty());
        for(String str : list){
            System.out.println(str);
        }
    }
}
