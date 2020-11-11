package org.testcalculate.star;

/**
 *打印空心的菱形
 * 这是上一道题的变体。题目：编程打印出如图所示的图形。
 * (空心的星只打印首位和末尾的两个星)
 */
public class RhombusEmptyDemo {
    public static void main(String[] args) {
        //最外层循环i控制输出的行数
        for(int i=1;i<=4;i++){
            //先打印图形上半部分
            //打印空格
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //打印下面的部分
        for(int i=1;i<=3;i++) {
            for(int k=1;k<=i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=-2*i+7;j++) {
                if(j==1||j==-2*i+7){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
