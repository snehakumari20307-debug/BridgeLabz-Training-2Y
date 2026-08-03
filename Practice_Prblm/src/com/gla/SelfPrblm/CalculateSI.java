package com.gla.SelfPrblm;

import java.util.Scanner;

public class CalculateSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double rate = sc.nextDouble();
        double t = sc.nextDouble();
        double SI = (p * rate * t)/100;
        System.out.println(SI);
    }
}
