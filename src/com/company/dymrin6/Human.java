package com.company.dymrin6;

public class Human implements Participant {
    @Override
    public void jump() {
        System.out.println("Human is jumping...");
    }

    @Override
    public void run() {
        System.out.println("Human is running...");
    }
}
