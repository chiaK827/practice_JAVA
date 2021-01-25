package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Input n(0 <= n <= 16):");
            int num = sc.nextInt();
            if(num == 999){
                break;
            }else{
                int ans = 1;
                for(int i = 1; i <= num; i++){
                    ans*=i;
                }
                System.out.println(num + "的階乘 = " + ans);
            }
        }
    }
}
