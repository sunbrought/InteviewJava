package org.dateConstruction.Array;

import java.util.*;

/**
 * 给定的1-100的数组中找出缺失的1个值
 */
public class SearhData {
    public static void main(String[] args) {
        int total=0;
        int date[]=new int[100];
        Random random=new Random();
        int lose=random.nextInt(99)+1;
        for(int i=1;i<lose;i++){
            date[i-1]=i;
        }
        for(int j=lose;j<date.length;j++){
            date[j-1]=j+1;
        }
        for(int i=0;i<date.length;i++){
            total+=date[i];
        }
        System.out.println("缺失的数字是："+(5050-total)+"/"+lose);
    }
}
