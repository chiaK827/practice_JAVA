package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++){
            System.out.println("Please enter score:");
            int score = sc.nextInt();
            if(score > 60){
                System.out.println("You Pass");
            }
            System.out.println("End");
        }



    }
}
