package org.dateConstruction.Array;

import java.util.HashMap;
import java.util.Map;

public class DataNum {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("rewfyeewewtrwewt4dsahifdafdjknj"));
    }
    public static int FirstNotRepeatingChar(String str){
        Map<Character, Integer> map= new HashMap<>();
        //统计数量
        int count=0;
        for(int i=0;i<str.length();i++){
            Character currentChar=str.charAt(i);
            if(!map.containsKey(currentChar)){
                map.put(currentChar,1);
            }else{
                count=map.get(currentChar)+1;
                map.put(currentChar,count);
            }
        }
        for(Character character : map.keySet()){
            if(map.get(character)==1){
                int index=str.indexOf(character);
                return index;
            }
        }
        return -1;
    }
}
