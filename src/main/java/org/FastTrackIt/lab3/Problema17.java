package org.FastTrackIt.lab3;

import java.util.Scanner;

public class Problema17 {
    //Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
    //suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        double sum = 0;
        for (int i=0; i<=0; i++){
            sum += Math.pow(a,n);

        }

        System.out.println("Rezultatul este: " + sum);


    }
}