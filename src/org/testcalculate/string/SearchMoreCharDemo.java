package org.testcalculate.string;

import java.util.HashMap;
import java.util.Map;

public class SearchMoreCharDemo {
    public static void main(String[] args) {
        //查询一个字符串中出现最多的5个字符和其数量
        String str = "aacssdefeffffettgggeewwwwwggggrhhh";
        //最多的字符
        String maxChar="";
        //将得到的字符放入数组中
        int data[]=new int[5];
        //统计字符的数量
        int maxCount=0;

        Map<Character,Integer> characterMap=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            //当前字符
            Character currentChar=str.charAt(i);
            //首先将不重复的字符存入Map集合中
            if(!characterMap.containsKey(currentChar)){
                characterMap.put(currentChar,0);
            }
        }
        //计算每个字符出现的数量
        for(int i=0;i<str.length();i++){
            Character currentChar=str.charAt(i);
            //遍历集合的键值，如果重复的话数量加1
            for(Character key : characterMap.keySet()){
                if(key.equals(currentChar)){
                    Integer val=characterMap.get(key);
                    val++;
                    characterMap.put(key,val);
                    if(val>maxCount){
                        maxCount=val;
                        maxChar=String.valueOf(key);
                    }
                }
            }
        }
        //遍历最多的字符和数量
        for(Character charkey : characterMap.keySet()){
            System.out.println(charkey+":出现的字符为--"+characterMap.get(charkey));
        }
        System.out.println("出现最多的字符为："+maxChar+",出现的数量为："+maxCount);
    }
}
