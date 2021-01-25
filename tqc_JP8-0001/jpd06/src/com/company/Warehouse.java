package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Warehouse {
    public static void main(String args[]) throws IOException {

        FileReader bmifile = new FileReader("bmi-1.txt");
        Scanner inf = new Scanner(bmifile);

        String name = null;
        int height;
        double weight;

        name = inf.next();
        height = inf.nextInt();
        weight = inf.nextDouble();
        System.out.printf("%-12s %5d %6.1f\n", name, height, weight);
        bmifile.close();
    }
}
