package org.dateConstruction.sort;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int arr[]={101,34,119,1};

        //需要交换的次数
        for(int i=0;i<arr.length-1;i++){
            //假设最小索引为第一位
            int minIndex=i;
            //假设第一位为最小值
            int min=arr[i];
            //与每个后面的数据进行判断
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];//重置min
                    minIndex=j;//重置minIndex
                }
            }
            //将最小值放在arr[0],即交换
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
            System.out.println("第"+(i+1)+"排的数组为："+ Arrays.toString(arr));
        }
    }
}
