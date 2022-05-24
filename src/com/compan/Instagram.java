package com.compan;

public class Instagram implements Messenger{
    private String name;
    private int time;

    public Instagram(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void sendMessenger() {
        System.out.println( " отправляет сообщение");


    }

    @Override
    public void getMessenger() {
        System.out.println(" читает сообщение");

    }
}
