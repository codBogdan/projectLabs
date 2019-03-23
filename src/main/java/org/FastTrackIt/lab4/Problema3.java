package org.FastTrackIt.lab4;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Problema3 {
    //Sa se determine maximul a N numere citite de la tastatura.

    public static void main(String[] args){
        int n;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Sirul de numere din care sa fie alcatuita operatia: ");
        n = input.nextInt();

        int[] numere = new int[n];
        for (i=0; i < n; i++){
            System.out.println("Numarul ales: " + (i+1));
            numere[i] = input.nextInt();
        }
        int max;
        max = numere[0];
        for (i=0; i < n; i++){
            if (numere[i]>max);
            max = numere[i];
        }
        System.out.println("Rezultatul este: " + max);
    }


}
