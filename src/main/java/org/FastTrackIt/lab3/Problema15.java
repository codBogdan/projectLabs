package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema15 {
//Sa se calculeze factorialul unui numar a .
//factorialul este definit asa:
//factorial  = 1*2*3*4….*a
//
//de ex pentru a = 4, factorialul este 1*2*3*4
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Numarul pentru calcularea factorialul este: ");
        int a = input.nextInt();
        long fact = 1;
        for (int b=1; b<=a; b++){
        fact *=b;
        }
        System.out.println("Factorialul este: " + fact);

    }
}
