package com.company;

public class Aircond {
    static int getCost(String type){
        if(type == "Auto"){
            return 12000;
        }else if(type == "Manual"){
            return 10000;
        }
        return 0;
    }
}
