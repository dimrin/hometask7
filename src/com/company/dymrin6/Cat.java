package com.company.dymrin6;

public class Cat implements Participant {
    @Override
    public void jump() {
        System.out.println("Cat is jumping..");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }
}
