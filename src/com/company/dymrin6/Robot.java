package com.company.dymrin6;

public class Robot implements Participant {
    @Override
    public void jump() {
        System.out.println("Robot is jumping...");
    }

    @Override
    public void run() {
        System.out.println("Robot is running...");
    }
}
