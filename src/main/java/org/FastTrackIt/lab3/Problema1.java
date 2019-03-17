package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        //Problema 1
        //Sa se calculeze medie aritmetica a doua numere pozitive citite de la tastatura.

        Scanner user = new Scanner(System.in);
        int a, b;
        int MediaAritmetica = 0;
        System.out.println("Primul numar: ");
        a = user.nextInt();
        System.out.println("Al doilea numar: ");
        b = user.nextInt();
        //System.out.println(a+","+b);
        MediaAritmetica = (a + b) / 2;
        System.out.println("MediaAritmetica: " + MediaAritmetica);
    }
}
