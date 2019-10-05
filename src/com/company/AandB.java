package com.company;

import java.util.Scanner;

public class AandB {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a = in.nextInt(); double b = in.nextInt();
        double x=0;
        x=(b*-1)/a;
        if (x==0 || b==0)
            System.out.println("no such x");
        if (x<0)
            System.out.println("any x");
        if (x>0){
            if (b<0)
                System.out.println("x<"+(-x)+" or x>"+x);
            if (a<0)
                System.out.println((-x)+"<x<"+x);
        }
    }
}
