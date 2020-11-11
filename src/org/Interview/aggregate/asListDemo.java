package org.Interview.aggregate;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays类下的aslist()方法可以将对象数组转换成List集合并进行返回
 * （因为方法的参数是接收的是泛型，所以必须传入对象数组类型）
 *
 */
public class asListDemo {
    public static void main(String[] args) {
        List list= Arrays.asList(1,2,3);
        System.out.println(list);
        System.out.println(list.getClass());
    }
}
