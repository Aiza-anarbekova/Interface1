package com.compan;

public class  Whatsapp implements Messenger {
    private String namePolzovatel;
    private int vremya;

    public Whatsapp(String namePolzovatel, int agePolzovatel) {
        this.namePolzovatel = namePolzovatel;
        this.vremya = agePolzovatel;
    }

    public String getNamePolzovatel() {
        return namePolzovatel;
    }

    public void setNamePolzovatel(String namePolzovatel) {
        this.namePolzovatel = namePolzovatel;
    }

    public int getVremya() {
        return vremya;
    }

    public void setVremya(int vremya) {
        this.vremya = vremya;
    }

    @Override
    public void sendMessenger() {
        System.out.println(namePolzovatel+ " отправляет сообщение");

    }

    @Override
    public void getMessenger() {
        System.out.println(namePolzovatel+" читает сообщение");

    }
}
