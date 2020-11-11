package org.highProgram.thirteen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("孙悟空");
        list.add("唐三藏");
        list.add("猪八戒");
        list.add("沙和尚");
        //获取ListIterator对象进行输出
        ListIterator iterator=list.listIterator();
        System.out.println("由前向后输出：");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"、");
        }
        System.out.println("\n由后向前输出：");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + "、");
        }
    }
}
