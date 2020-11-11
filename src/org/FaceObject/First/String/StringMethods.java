package org.FaceObject.First.String;



public class StringMethods {
    public static void main(String[] args) {
        String str="Hello!!!";
        char c=str.charAt(0);
        System.out.println("取出索引为0的字符："+c);
        //将字符变为字符数组
        char[] array=str.toCharArray();
        System.out.print("字符数组的内容：");
        for(int i=0;i<array.length;i++){
            //将字符按串转为大写(因为小写字母的ASCII值比大写的多32)
            //一个字符减去数字，先将字符转换为数字然后做运算，完了之后由于结果需要字符，所以又转为字符。
            /*array[i]-=32;*/
            System.out.print(array[i]+",");
        }
        System.out.println();
        //将字符数组转为字符串
        String string=new String(array);
        System.out.println("转好的字符串："+string);
        //将前三位转为字符
        System.out.println("将前三位转为字符"+new String(array,0,3));
        //判断一个字符数组是否位数字
        if(isNumber()){
            System.out.println("此字符数组是数字");
        }else{
            System.out.println("此字符数组不是数字");
        }
    }
    public static boolean isNumber(){
        String str="1233iu3243";
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>'9'||c[i]<'0'){
                return false;
            }
        }
        return true;
    }
}
