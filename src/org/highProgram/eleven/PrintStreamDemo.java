package org.highProgram.eleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        PrintStream printStream;
        {
            try {
                printStream = new PrintStream(new FileOutputStream(new File("E:"+File.separator+"demo.txt")));
                printStream.println("Hello world");
                printStream.println(7*3);
                printStream.println(3.2+3.3);
                printStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
