package org.highProgram.eleven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new FileInputStream(new File("E:"+File.separator+"Demo.txt")));
        //设置读取的分隔符
        scanner.useDelimiter("\n");
        //因为有分隔符，所以需要多次读取
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
