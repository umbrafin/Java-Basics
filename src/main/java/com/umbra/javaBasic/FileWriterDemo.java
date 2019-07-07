package com.umbra.javaBasic;


import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;



/**
 * java 基础练习
 */
public class FileWriterDemo {


    public static void main(String[] args) {

        String filepath = "F:/workspace/logout/debug2.log";

        File file = new File(filepath);

        Writer writer = null;

        try {
            writer = new FileWriter(file,true);
            writer.write("testfin.");

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
