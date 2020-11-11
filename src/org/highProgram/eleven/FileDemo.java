package org.highProgram.eleven;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //设置文件路径
        File file = new File("E:" + File.separator + "Demo" +
                File.separator + "Demo" + File.separator + "Demo.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if(file.exists()){
            file.delete();
        }else{
            System.out.println(file.createNewFile());
        }
    }
}
