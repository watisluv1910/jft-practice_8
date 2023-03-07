package org.app.mediator;

public class MediatorTest {

    public static void main(String[] args) {

        ChatRoom chat = new ChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setName("Vlad Nasevich");
        u1.sendMessage("Hi Vlad! How are you?");


        User2 u2=new User2(chat);
        u2.setName("Stas Povedenok");
        u2.sendMessage("I am just fine! And you?");
    }
}
