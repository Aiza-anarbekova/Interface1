package com.compan;

public class Main {

    public static void main(String[] args) {
	Messenger messenger=new Whatsapp("Asan",12);
    Messenger messenger1=new Instagram("aiz");
    Messenger messenger2=new Facebook("Shasha",12);
    Messenger[] massiv={messenger,messenger1,messenger2};
        for (Messenger messeng:massiv) {
            messeng.sendMessenger();
            messeng.getMessenger();
        }
        Messenger.staticMethod();


    }
}
