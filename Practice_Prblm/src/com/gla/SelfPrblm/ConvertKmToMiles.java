package com.gla.SelfPrblm;

import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Kilo = sc.nextDouble();
        double Miles = (Kilo * 0.621371);
        System.out.println(Miles);
    }
}
