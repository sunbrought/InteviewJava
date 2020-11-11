package org.dateConstruction.sort;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int data[]={3,9,-1,10,-2};

        //定义一个临时变量
        int temp=0;
        boolean flag=false;
        //冒泡排序的时间复杂度w为o(^2)
        //排序的趟数（每趟可以确定一个最大数）
        for(int i=0;i<data.length-1;i++){
            //此躺排序的次数（）
            for(int j=0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]){
                    flag=true;
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
            System.out.println("第"+(i+1)+"躺排序的数："+ Arrays.toString(data));
            if(!flag){
                break;
            }else{
                flag=true;
            }
        }
    }
}
