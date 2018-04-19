package com.nimesh;

public class Main {

    public static void main(String[] args) {
        IPhone myPhone;
        myPhone = new DeskPhone(405-434-6961);

        myPhone.power();
        myPhone.callPhone(405-434-6961);
        myPhone.answer();

        myPhone = new MobilePhone(405-434-6961);
        //myPhone.power();
        myPhone.callPhone(405-434-6961);
        myPhone.answer();


    }
}
