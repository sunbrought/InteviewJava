package org.FaceObject.First.String;

public class StringSplit {
    public static void main(String[] args) {
        String str="张三:20|李四:39|王五:32";
        //必须使用转义字符进行转换
        String str1[]=str.split("\\|");
        for(int i=0;i<str1.length;i++){
            //对:进行拆分
            String str2[]=str1[i].split(":");
            System.out.println("拆分的数组："+str1[i]+"姓名："+str2[0]+",年龄："+str2[1]);
        }
    }
}
