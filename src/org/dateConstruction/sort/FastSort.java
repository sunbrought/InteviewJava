package org.dateConstruction.sort;

import java.util.Arrays;

public class FastSort {
    public static void main(String[] args) {
        int arr[]={32,34,532,33,86,4,23,87,56};
        getFastSortExec(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr 需要排序的数组
     * @param left 排序的开始点
     * @param right 排序的结束点
     */
    public static void getFastSortExec(int arr[],int left,int right){
        //如果left大于right时候则不满足条件跳出
        if(left>right){
            return;
        }
        //定义基准数
        int base=arr[left];
        //定义变量i，指向最左边
        int i=left;
        //定义变量j，指向最右边
        int j=right;
        //如果索引i和j相等时则停止，进行数据交换（当i和j不相遇的时候，在循环中进行检索）
        while(i != j){
            //由j从右往左检索比基准数小的，如果检索到比基准数小的就停下，
            //如果检索到比基准数大的或者相等的，就继续检索
            while(arr[j] >=base && i<j){
                j--;//j从右往左检索
            }
            //排左边
            while(arr[i]<=base && i<j){
                i++;
            }
            //i和j停下之后，交换i和j的位置
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        //如果上面程序不成立则跳出循环执行下面的代码
        //另外一个方面说明i和j处于相等的位置，此时交换基准数和这个位置相遇的数
        arr[left]=arr[i];
        arr[i]=base;

        //基准数在这里归就归位了，左边的数都比他小，右边的数都比他大
        //基准数的左排
        getFastSortExec(arr,left,i-1);
        //基准数右排
        getFastSortExec(arr,j+1,right);
    }
}
