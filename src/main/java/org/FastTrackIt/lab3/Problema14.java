package org.FastTrackIt.lab3;

import java.util.Scanner;
//se dau doua numere a si n. sa se afiseze numarul a la puterea n

public class Problema14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a,b;
        System.out.println("Primul numar este: ");
        a = input.nextInt();
        System.out.println("Al doilea numar este: ");
        b = input.nextInt();
        System.out.println("Rezultatul este: " + Math.pow(a,b));

    }
}
