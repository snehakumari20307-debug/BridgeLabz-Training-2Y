package com.gla.SelfPrblm;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int exp = (base ^ power);
        System.out.println(exp);
    }
}
