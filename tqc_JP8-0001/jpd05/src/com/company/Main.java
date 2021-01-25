package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num[] = new int[10];
        int cnt = 0;
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入10個整數：");
        for(int i = 0; i < 10; i++){
            System.out.print("第"+ (i+1) +"個整數：");
            num[i] = sc.nextInt();
            if(num[i]>60){
                cnt++;
                total += num[i];
            }
        }
        System.out.println("陣列中大於60的有" + cnt + "個");
        System.out.println("總合為" + total);
        System.out.println("平均值為" + (total/cnt));

    }
}
