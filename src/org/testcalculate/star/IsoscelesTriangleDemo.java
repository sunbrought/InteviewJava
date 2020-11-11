package org.testcalculate.star;

/**
 *打印等腰三角形
 * 题目：编程打印出如图所示的图形。
 */
public class IsoscelesTriangleDemo {
    public static void main(String[] args) {
        //外循环变量i控制行数，共有5行
        for(int i=1;i<=5;i++){
            /**
             * i:1,2,3,4,5
             * k:4,3,2,1,0
             * j:1,3,5,7,9
             * 计算他们与i的关系，计算出y=kx+b的方程式
             */
            //打印空格
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            //打印星星
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
