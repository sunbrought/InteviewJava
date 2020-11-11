package org.highProgram.eleven;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoProgramDemo {
    public static void main(String[] args) {
        //设置文件的路径
        File file =new File("E:"+File.separator+"aop.png");
        System.out.println("获得文件的名称："+file.getName());
        System.out.println("获取文件的真实路径："+file.getPath());
        System.out.println("获取文件的内存大小："+(new BigDecimal((double)file.length()/1024))
                .divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP));
        System.out.println("获取问价上次修改的时间："+new Date(file.lastModified()));
        System.out.println("获取问价上次修改的时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(file.lastModified()));
        File file1 =new File("E:"+File.separator);
        /*获取当前目录下所有的信息*/
        if(file1.isDirectory()){//判断是是不是一个目录
            String[] str=file1.list();
            if(str!=null){
                for(int i=0;i<str.length;i++){
                    System.out.println(str[i]);
                }
            }
        }
        File[] e=file1.listFiles();
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }
    }
}
