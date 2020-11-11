package org.highProgram.ten;

public class SystemDemo {
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        String str="";
        for(int x=0;x<300;x++){
            str+=x;
        }
        Long end=System.currentTimeMillis();
        System.out.println("本次所花费的时间："+(end-start));
    }
}
