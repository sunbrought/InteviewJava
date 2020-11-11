package org.highProgram.eleven;

import java.io.*;

public class BufferReaderDemoFile {
    public static void main(String[] args) throws IOException {
        File file=new File("E:"+File.separator+"Demo.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String str=null;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
