package org.testcalculate.star;

/**
 * 打印实心的菱形
 * 题目：编程打印出如图所示的图形。
 */
public class RhombusAllDemo {
    public static void main(String[] args) {
        //打印上部分等腰三角形
        //外循环i控制输入的行数
        for(int i=1;i<=4;i++){
            //i<=4，打印上方的等腰三角形
                //打印上部分三角形(空格),i<=4
                for(int j=1;j<=4-i;j++){
                    System.out.print(" ");
                }
                //打印上部分三角形(星),i<=4
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
            System.out.println();
            }
        //打印下部分
        //外层循环i控制打印的行数
        for(int i=1;i<=3;i++) {
            for(int k=1;k<=i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=-2*i+7;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
