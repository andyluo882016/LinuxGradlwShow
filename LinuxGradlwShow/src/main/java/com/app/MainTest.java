package com.app;

public class MainTest {
//https://github.com/andyluo882016/LinuxGradlwShow.git
    public static void main(String[] args){
        System.out.println("Show Demo");
        MainTest test = new MainTest();
        System.out.println(test.getGreeting());
    }

    public String getGreeting() {
        return "Hello World!";
    }
}
