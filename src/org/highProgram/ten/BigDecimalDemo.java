package org.highProgram.ten;


import java.math.BigDecimal;

class MyMath{
    public static double round(double num, int scale){
        BigDecimal bigA=new BigDecimal(num);
        BigDecimal bigB=new BigDecimal(1);
        return bigA.divide(bigB,scale,BigDecimal.ROUND_UP).doubleValue();
    }
}
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(String.valueOf(MyMath.round(19.3333333,2)));
        System.out.println(String.valueOf(MyMath.round(-15.5,0)));
        System.out.println(String.valueOf(MyMath.round(15.5,0)));
    }
}
