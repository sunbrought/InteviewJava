package org.highProgram.thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"A","B","C","D");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
