package org.FastTrackIt.lab3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problema3 {
    //Sa se determine maximul a N numere citite de la tastatura.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int NumarulMaxim = 0;
        System.out.println("Primul numar ales: ");
        a = input.nextInt();
        System.out.println("Numarul al doilea ales: ");
        b = input.nextInt();
        System.out.println("Numarul maxim este:" + Math.max(a,b));






    }
}


