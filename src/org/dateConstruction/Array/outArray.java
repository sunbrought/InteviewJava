package org.dateConstruction.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class outArray {
    public static void main(String[] args) {
        System.out.println(Permutation("aaaanna"));
    }
    public static ArrayList<String> Permutation(String str){
        List<String> list=new ArrayList<>();
        if(str.length()>9){
            return null;
        }
        if(str.equals("")){
            return (ArrayList<String>) list;
        }
        String string=new String(str);
        Set<String> set=new HashSet<String>();
        char[] ch=new char[str.length()];
        for(int i=0;i<string.length();i++){
            ch[i]=str.charAt(i);
            set.add(String.valueOf(ch[i]));
        }
        if(set.size()==1){
            list.add(str);
            return (ArrayList<String>) list;
        }
        int temp=0;
        list.add(str);
        //字符串
        int j=str.length()-1;
        char[] chars=new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[j]=str.charAt(i);
            j--;
        }
        String result=String.valueOf(chars);
        list.add(result);
        return (ArrayList<String>) list;
    }
}
