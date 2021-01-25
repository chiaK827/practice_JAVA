package com.company;

public class Engine {
    static int getCost(int cc){
        if(cc == 1600){
            return 20000;
        }else if(cc == 2000){
            return 25000;
        }else{
            return 0;
        }
    }
}
