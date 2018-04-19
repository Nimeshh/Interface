package com.nimesh;

public class DeskPhone implements IPhone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void power() {
        System.out.println("There is no power button in a desk phone");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on a deskphone");

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
        if (phoneNumber == myNumber) {
            System.out.println("Ring ring");
            isRinging = true;
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
