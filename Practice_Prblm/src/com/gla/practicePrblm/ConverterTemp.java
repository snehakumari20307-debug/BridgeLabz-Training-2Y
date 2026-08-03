package com.gla.practicePrblm;

import java.util.Scanner;

public class ConverterTemp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
