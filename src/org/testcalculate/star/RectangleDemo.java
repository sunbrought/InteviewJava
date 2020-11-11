package org.testcalculate.star;
/**
 * 我们先来看个最简单的！题目：编程打印出如图所示的图形。
 * 打印长方形
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //外循环变量i控制行数，一共有5行
        for(int i=1;i<=5;i++){
            //内循环变量控制每行打印符合的次数，每行打印7次符号
            for(int j=1;j<=7;j++){
                System.out.print("*");
            }
            //每打印一行进行一次换行
            System.out.println();
        }
    }
}
