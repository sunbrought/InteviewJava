package org.dateConstruction.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        reOrder(new int[]{1,2,3,4,5,6,7,8});
    }
    public static void reOrder(int [] array){
        List list1=new ArrayList();
        List list2=new ArrayList();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                list1.add(array[i]);
            }else{
                list2.add(array[i]);
            }

        }
        for(int i=0;i<list1.size();i++){
            array[i]= (int) list1.get(i);
        }
        for (int i=0;i<list2.size();i++){
            array[list1.size()+i]= (int) list2.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
}
