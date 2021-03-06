package com.umbra.javaBasic;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * java 基础练习
 */
public class FileReaderDemo {


    public static void main(String[] args) {

        String filepath = "F:/workspace/logout/debug2.log";

        //创建输入流对象
        //File file = new File(filepath);

        Reader reader = null;

        try {

            //读取数据
            reader = new FileReader(filepath);

            int c = -1;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }


        } catch (IOException e) {
            e.printStackTrace();


        } finally {
            //关闭输入流
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
