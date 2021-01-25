package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int f = sc.nextInt();
        int total = 0;
        for(int i = 1; i<=f; i++){
            total+=i;
        }
        System.out.println("1+...+" + f + "=" + total);
    }
}
