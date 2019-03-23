package org.FastTrackIt.lab4;

import java.util.Scanner;

public class Problema8 {
    //Se da un numar a. Sa se determine daca numarul este palindrom ori nu.
    //Un numar este palindrom daca este egal cu numarul inversat
    //de ex
    //int a = 12344321 este palindrom

    public static void  main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        int a;
        int inv = 0;
        System.out.println("Dati un numar: ");
        a = input.nextInt();

        int aux = a;
        while (a != 0) {
            inv = inv * 10 + (a % 10);
            a = a / 10;
        }
        System.out.println("Inversul este: " + inv);
        if (aux == inv)
        System.out.println("Numarul este polidrom!");
        else
        System.out.println("Numarul nu este polidrom!");
    }
}
