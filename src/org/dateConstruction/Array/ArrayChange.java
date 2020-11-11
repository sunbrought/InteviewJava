package org.dateConstruction.Array;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int date[]=new  int[]{1,2,3,4,5,6,7};
        jumpFloor(date);
    }
    public static void jumpFloor(int[] array) {
       int arr[]=new int[array.length];
       int start=0;
       int part=array.length/2;
       if(array.length%2==0){
           for(int i=0;i<array.length;i++){
               if(array[i]%2==1){
                   arr[start]=array[i];
                   start++;
               }else{
                   arr[part]=array[i];
                   part++;
               }
           }
       }else{
           for(int i=0;i<array.length;i++){
               if(array[i]%2==1){
                   arr[start]=array[i];
                   start++;
               }else{
                   arr[part+1]=array[i];
                   part++;
               }
           }
       }

        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));
    }
}
