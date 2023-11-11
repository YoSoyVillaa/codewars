package com.yosoyvillaa.codewars.bcn2023;

import java.util.Scanner;

public class OhmsLaw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce the Amps: ");
        int amps = sc.nextInt();
        System.out.print("Introduce the Ohms: ");
        int ohms = sc.nextInt();

        System.out.println(amps * ohms);
    }
}