package org.highProgram.thirteen;

import java.util.ArrayList;
import java.util.List;

public class StreamIterableDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        //函数式消费型接口，只有参数无返回值
        list.forEach(System.out :: println);
    }
}
