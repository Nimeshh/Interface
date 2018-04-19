package com.nimesh;

public class MobilePhone implements IPhone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void power() {
        isOn = true;
        System.out.println("The power is now powered on");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on a mobile phone");

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            System.out.println("Melody Ring");
            isRinging = true;
        }
        else{
            System.out.println("The phone is powered off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

