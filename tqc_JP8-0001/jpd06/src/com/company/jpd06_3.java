package com.company;

public class jpd06_3 {
    public static void main(String[] args) {
        // write your code here
        int slux_cost;
        slux_cost = jpd06_2.getCarCost("lux") + Sound.getCost();
        System.out.println("SLux cost: " + slux_cost);
        System.out.println("SLux price: " + (slux_cost*1.2));
        System.out.println("Is SLuxCar more expensive than LuxCar? " + expensive());
    }

    static String expensive(){
        int slux, lux;
        slux = jpd06_2.getCarCost("lux") + Sound.getCost();
        lux = jpd06_2.getCarCost("lux");
        if(slux>lux){
            return "Yes!!";
        }else{
            return "No";
        }
    }
}
