package org.dateConstruction.sort;
//选择排序/**

import java.util.Arrays;

/**
 * 每次挑选最小的数放在最前面，首先设第一个数为最小数，下标为最小数索引下标
 */
public class ChoiceDemo {
    public static void main(String[] args) {
        //需要操作的数组
        int arr[]={101,34,119,1,34,63,23};
        //循环的次数
        for(int i=0;i<arr.length-1;i++){
            //设置第一位为最小数
            int min=arr[i];
            //设置第一个下标为最小数下标
            int minIndex=i;
            //定位最小数和最小数的下标
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            //进行 交换位置
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
