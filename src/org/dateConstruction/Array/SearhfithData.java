package org.dateConstruction.Array;


import java.util.*;

public class SearhfithData {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        Random random=new Random();
        for(int i=0;i<101;i++){
            list.add(i);
        }
        for(int i=0;i<5;i++){
            list.remove(random.nextInt(100));
        }
        System.out.println(list.toString());
        searhDate1(list);
        seachDate2(list);
        searchDate3(list);
    }
    //方法一
    /**
     * 运用集合的值来确定数组的下标
     * 当把list集合中的值传入数组中，缺失值得位置为空，所以他们下标就是我们需要查找得值
     * @param list
     */
    public static void searhDate1(List<Integer> list){
        //定义新数组，用来存放遍历的标记
        int[] arr=new int[101];
        for(Integer i: list){
            arr[i]=1;
        }
        for(int j=1;j<101;j++) {
            if (arr[j] == 0) {//输出剩下的5个
                System.out.println(j);
            }
        }
    }
    //方法二
    /**
     * 使用一个满数集合移除缺少数字的集合就可得到缺失的数
     */
    public static void seachDate2(List<Integer> list){
        List<Integer> newList=new ArrayList<Integer>();
        for(int i=1;i<101;i++){
            newList.add(i);
        }
        newList.removeAll(list);
        System.out.println("方法二得到的缺失数字："+newList.toString());
    }
    //方法三
    /**
     * 运用Map集合获取缺少得值
     */
    public static void searchDate3(List<Integer> list){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<101;i++){
            map.put(i,null);
        }
        for(Integer i : list){
            map.put(i,i);
        }
        System.out.println("缺失得值：");
        for(int i=0;i<map.size();i++){
            if(map.get(i)==null){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

}
