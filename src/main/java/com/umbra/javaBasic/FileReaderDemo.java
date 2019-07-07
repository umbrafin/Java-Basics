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
            int c = reader.read();
            System.out.println(c);

        } catch (IOException e) {
            e.printStackTrace();

            //关闭输入流
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
