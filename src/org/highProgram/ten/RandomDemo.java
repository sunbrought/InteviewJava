package org.highProgram.ten;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random=new Random();
        int a[]=new int[7];
        int foot=0;
        while(foot<7){
            int num=random.nextInt(37);
            if(!isReplace(a,num)){
                a[foot++]=num;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"、");
        }
    }
    //判断是否重复
    public static Boolean isReplace(int a[],int num){
        if(num==0){
            return true;
        }
        for(int x=0;x<a.length;x++){
            if(a[x]==num){
                return true;
            }
        }
        return false;
    }
}
