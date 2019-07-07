package com.umbra.javaBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        String filepath = "F:/workspace/logout/debug2.log";

        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader(filepath));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){

                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
