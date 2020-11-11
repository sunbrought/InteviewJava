package org.testcalculate.star;

/**
 * 打印倒着的直角三角形
 * 看一下上道题的变体。题目：编程打印出如图所示的图形。
 */
public class ReverseTriangleDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //内循环变量j控制每行打印符号的次数
            /**
             * i:1,2,3,4,5
             * j:5,4,3,2,1
             */
            for(int j=5;j<=i;j--){
                System.out.print("*");
            }

//            for(int j=1;j<=6-i;j++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
}

