package com.umbra.javaBasic;

/**
 * 单例模式
 * 只能 创建一个对象时，用到类似的写法；
 */
public class Singleton {

    private static Singleton s;

    private String output = "testSingleton";


    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }


        return s;
    }


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
