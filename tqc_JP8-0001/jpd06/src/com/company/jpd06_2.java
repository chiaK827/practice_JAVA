package com.company;

public class jpd06_2 {
    public static void main(String[] args) {
        // write your code here
        int basic_cost, lux_cost;
        basic_cost = getCarCost("basic");
        lux_cost = getCarCost("lux");
        System.out.println("Basic cost: " + basic_cost);
        System.out.println("Basic price: " + (basic_cost*1.2));
        System.out.println("Lux cost: " + lux_cost);
        System.out.println("Lux price: " + (lux_cost*1.2));
    }

    static int getCarCost(String type){
        int cost = 0;
        if(type == "basic"){
            cost = Engine.getCost(1600) + Aircond.getCost("Manual") + 5000;
        }else if(type == "lux"){
            cost = Engine.getCost(2000) + Aircond.getCost("Auto") + 10000;
        }
        return cost;
    }
}
