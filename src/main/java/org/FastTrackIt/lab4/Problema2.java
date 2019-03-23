package org.FastTrackIt.lab4;

import java.util.Scanner;

// Sa se calculeze media aritmetica a N numere pozitive citite de la tastatura.

public class Problema2 {
    public static void main(String[] args){
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sirul de numere N ales: ");
        n = input.nextInt();

     int[] numere = new int[n];
     for (int i = 0; i < n; i++) {
         System.out.println("Numarul ales: " + (i + 1));
         numere[i] = input.nextInt();
         total = total + numere[i];
     }
        double Medie;
        Medie = total / n;
        System.out.println("Rezultatul este: " + Medie);

    }
}
