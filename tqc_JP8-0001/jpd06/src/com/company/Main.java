package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1600 cost: " + Engine.getCost(1600));
        System.out.println("2000 cost: " + Engine.getCost(2000));
        System.out.println("Auto: " + Aircond.getCost("Auto"));
        System.out.println("Manual: " + Aircond.getCost("Manual"));
        System.out.println("Sound: " + Sound.getCost());
    }
}
