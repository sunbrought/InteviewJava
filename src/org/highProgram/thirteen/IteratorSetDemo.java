package org.highProgram.thirteen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set set=new HashSet<String>();
        set.add("孙悟空");
        set.add("唐三藏");
        set.add("猪八戒");
        set.add("沙和尚");
        //获取Iterator对象进行输出
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
