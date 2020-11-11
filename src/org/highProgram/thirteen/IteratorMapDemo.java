package org.highProgram.thirteen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("一",1);
        map.put("二",2);
        map.put("三",3);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry= iterator.next();
            System.out.print(entry.getKey()+"-");
            System.out.print(entry.getValue()+"          ");
        }
    }
}
