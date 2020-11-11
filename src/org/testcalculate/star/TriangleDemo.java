package org.testcalculate.star;

/**
 * 难度一点一点增加啰！题目：编程打印出如图所示的图形。
 * 打印直角三角形
 */
public class TriangleDemo {
    public static void main(String[] args) {
        //外循环变量i控制行号，共有5行
        for(int i=1;i<=5;i++){
            //内循环变量j控制每行打印符号的次数
            /**
             * i:1,2,3,4,5
             * j:1,2,3,4,5
             */
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
